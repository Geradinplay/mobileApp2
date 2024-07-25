package com.example.myapplication2.ui.anime;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication2.AnimeItem;
import com.example.myapplication2.DetailsAnimeActivity;
import com.example.myapplication2.R;
import com.example.myapplication2.UserObject;
import com.example.myapplication2.databinding.FragmentAnimeBinding;

import java.util.ArrayList;
import java.util.List;

public class AnimeFragment extends Fragment {
    private FragmentAnimeBinding binding;
    private AnimeViewModel animeViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        animeViewModel = new ViewModelProvider(this).get(AnimeViewModel.class);
        binding = FragmentAnimeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        List<AnimeItem> animeItems = new ArrayList<>();
        animeItems.add(new AnimeItem("https://animestars.org/uploads/posts/2024-07/c78e33d379_1.webp", "Anime 1", null, new ArrayList<>()));
        animeItems.add(new AnimeItem("https://animestars.org/uploads/posts/2024-07/1.webp", "Anime 2", "Description 2", new ArrayList<>()));
        animeItems.add(new AnimeItem("https://animestars.org/uploads/posts/2024-07/c78e33d379_1.webp", "Anime 1", "Description 1", new ArrayList<>()));
        animeItems.add(new AnimeItem("https://animestars.org/uploads/posts/2024-07/1.webp", "Anime 2", "Description 2", new ArrayList<>()));
        animeItems.add(new AnimeItem("https://animestars.org/uploads/posts/2024-07/c78e33d379_1.webp", "Anime 1", "Description 1", new ArrayList<>()));
        animeItems.add(new AnimeItem("https://animestars.org/uploads/posts/2024-07/1.webp", "Anime 2", "Description 2", new ArrayList<>()));
        animeItems.add(new AnimeItem("https://animestars.org/uploads/posts/2024-07/c78e33d379_1.webp", "Anime 1", "Description 1", new ArrayList<>()));
        animeItems.add(new AnimeItem("https://animestars.org/uploads/posts/2024-07/1.webp", "Anime 2", "Description 2", new ArrayList<>()));
        animeItems.add(new AnimeItem("https://animestars.org/uploads/posts/2024-07/c78e33d379_1.webp", "Anime 1", "Description 1", new ArrayList<>()));
        animeItems.add(new AnimeItem("https://animestars.org/uploads/posts/2024-07/1.webp", "Anime 2", "Description 2", new ArrayList<>()));
        animeItems.add(new AnimeItem("https://animestars.org/uploads/posts/2024-07/c78e33d379_1.webp", "Anime 1", "Description 1", new ArrayList<>()));
        animeItems.add(new AnimeItem("https://animestars.org/uploads/posts/2024-07/1.webp", "Anime 2", "Description 2", new ArrayList<>()));
        // Настраиваем адаптер для ListView
        RecyclerView recyclerView = binding.animeList; // Замените на id вашего RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext())); // Или другой LayoutManager
        AnimeRecyclerViewAdapter adapter = new AnimeRecyclerViewAdapter(requireContext(), animeItems);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(position -> {
            // Обработка клика на элемент списка
            Toast.makeText(getContext(), "Item clicked", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getActivity(), DetailsAnimeActivity.class);
            startActivity(intent);
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
