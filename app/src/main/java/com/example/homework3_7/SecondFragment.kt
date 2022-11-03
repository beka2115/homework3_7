package com.example.homework3_7

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.homework3_7.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private lateinit var fragmentPosition: SecondFragmentArgs


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // val fragmentPositionMy = arguments?.getInt(MainFragment.KEY_FOR_FRAGMENT_ALIVE)
        arguments?.let {
            fragmentPosition = SecondFragmentArgs.fromBundle(it)
        }
        val fragmentPositionMy = fragmentPosition.live

        if (fragmentPositionMy == 1) {
            binding.textLive.text = "Alive"
            binding.textName.text = "Dwayne Johnson"
            Glide.with(binding.imgSecond)
                .load("https://www.gannett-cdn.com/-mm-/c7f19ce71e89cf6fe1dd80f11576317be5be7c1a/c=81-49-536-655/local/-/media/2015/08/09/Nashville/Nashville/635747156114679004-Dwayne-Johnson.png?width=455&height=606&fit=crop&format=pjpg&auto=webp")
                .into(binding.imgSecond)
        }
        if (fragmentPositionMy == 2) {
            binding.textLive.text = "Alive"
            binding.textName.text = "Robert Downey Jr"
            Glide.with(binding.imgSecond)
                .load("https://kinowar.com/wp-content/uploads/2015/05/%D0%A0%D0%BE%D0%B1%D0%B5%D1%80%D1%82-%D0%94%D0%B0%D1%83%D0%BD%D0%B8-%D0%BC%D0%BB%D0%B0%D0%B4%D1%88%D0%B8%D0%B9-%D1%84%D0%BE%D1%82%D0%BE-Robert-Downey-Jr.-photo.jpg")
                .into(binding.imgSecond)
        }
        if (fragmentPositionMy == 3) {
            binding.textLive.text = "Alive"
            binding.textName.text = "Chris Evans"
            Glide.with(binding.imgSecond)
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-1RwNyvcIw00MtTXGPxeUnAXM3KmGork-Cg&usqp=CAU")
                .into(binding.imgSecond)
        }
        if (fragmentPositionMy == 4) {
            binding.textLive.text = "Alive"
            binding.textName.text = "Scarlett Johansson"
            Glide.with(binding.imgSecond)
                .load("https://fs.kinomania.ru/file/person/1/95/195688ae35f80d6aca00e2fb5cd80b90.jpeg")
                .into(binding.imgSecond)
        }
        if (fragmentPositionMy == 5) {
            binding.textLive.text = "Died"
            binding.textName.text = "Chadwick Boseman"
            Glide.with(binding.imgSecond)
                .load("https://people.com/thmb/9-sm9EuTj0QZKn-NH58Vd9G8U2g=/1000x1000/smart/filters:no_upscale():focal(749x179:751x181)/Chadwick-Boseman-1-f43b4dc9422544328000d185646b4cf4.jpg")
                .into(binding.imgSecond)
        }
        if (fragmentPositionMy == 6) {
            binding.textLive.text = "Alive"
            binding.textName.text = "Emil Esenaliev"
            Glide.with(binding.imgSecond)
                .load("https://insta.izde.kg/images/portfolio/emil_esenaliev_official.jpg")
                .into(binding.imgSecond)
        }
        if (fragmentPositionMy == 7) {
            binding.textLive.text = "Alive"
            binding.textName.text = "Murat Legenda"
            Glide.with(binding.imgSecond)
                .load("https://pic.rutubelist.ru/userappearance/d4/84/d484731ae2fd2e240650d96eb8b9a25f.jpeg")
                .into(binding.imgSecond)
        }
        if (fragmentPositionMy == 8) {
            binding.textLive.text = "Died"
            binding.textName.text = "Albert Einstein"
            Glide.with(binding.imgSecond)
                .load("https://parade.com/.image/t_share/MTkwNTgwOTUyNjU2Mzg5MjQ1/albert-einstein-quotes-jpg.jpg")
                .into(binding.imgSecond)
        }
        if (fragmentPositionMy == 9) {
            binding.textLive.text = "Alive"
            binding.textName.text = "Spanch Bob"
            Glide.with(binding.imgSecond)
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQaOFGtNJM7PgwFdbUJ_AIGDpfsA6ajHMnKJQ&usqp=CAU")
                .into(binding.imgSecond)
        }
        if (fragmentPositionMy == 10) {
            binding.textLive.text = "Alive"
            binding.textName.text = "Tomas Shelby"
            Glide.with(binding.imgSecond)
                .load("https://i.pinimg.com/originals/b8/10/e3/b810e3b20a5167598122f76fc171c574.jpg")
                .into(binding.imgSecond)
        }


    }


}