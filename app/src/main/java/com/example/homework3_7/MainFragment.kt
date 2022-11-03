package com.example.homework3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.homework3_7.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    companion object{
         const val KEY_FOR_FRAGMENT_ALIVE="Key1"
        const val KEY_FOR_FRAGMENT_NAME="Key2"

    }

    private lateinit var binding: FragmentMainBinding
    private var navList= arrayListOf<NavigationComponents>()
    private lateinit var adapter:NavigationAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        adapter=NavigationAdapter(navList,this::onClick)
        binding.recyclerMain.adapter=adapter
        

    }

    fun loadData(){
        navList.clear()
        navList.add(NavigationComponents("Alive","https://www.gannett-cdn.com/-mm-/c7f19ce71e89cf6fe1dd80f11576317be5be7c1a/c=81-49-536-655/local/-/media/2015/08/09/Nashville/Nashville/635747156114679004-Dwayne-Johnson.png?width=455&height=606&fit=crop&format=pjpg&auto=webp", "Dwayne Johnson",  1))
        navList.add(NavigationComponents("Alive","https://kinowar.com/wp-content/uploads/2015/05/%D0%A0%D0%BE%D0%B1%D0%B5%D1%80%D1%82-%D0%94%D0%B0%D1%83%D0%BD%D0%B8-%D0%BC%D0%BB%D0%B0%D0%B4%D1%88%D0%B8%D0%B9-%D1%84%D0%BE%D1%82%D0%BE-Robert-Downey-Jr.-photo.jpg","Robert Downey Jr",2))
        navList.add(NavigationComponents("Alive","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-1RwNyvcIw00MtTXGPxeUnAXM3KmGork-Cg&usqp=CAU","Chris Evans",3))
        navList.add(NavigationComponents("Alive","https://fs.kinomania.ru/file/person/1/95/195688ae35f80d6aca00e2fb5cd80b90.jpeg","Scarlett Johansson",4))
        navList.add(NavigationComponents("Died","https://people.com/thmb/9-sm9EuTj0QZKn-NH58Vd9G8U2g=/1000x1000/smart/filters:no_upscale():focal(749x179:751x181)/Chadwick-Boseman-1-f43b4dc9422544328000d185646b4cf4.jpg","Chadwick Boseman",5))
        navList.add(NavigationComponents("Alive","https://insta.izde.kg/images/portfolio/emil_esenaliev_official.jpg","Emil Esenaliev",6))
        navList.add(NavigationComponents("Alive","https://pic.rutubelist.ru/userappearance/d4/84/d484731ae2fd2e240650d96eb8b9a25f.jpeg","Murat Legenda",7))
        navList.add(NavigationComponents("Died","https://parade.com/.image/t_share/MTkwNTgwOTUyNjU2Mzg5MjQ1/albert-einstein-quotes-jpg.jpg","Albert Einstein",8))
        navList.add(NavigationComponents("Alive","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQaOFGtNJM7PgwFdbUJ_AIGDpfsA6ajHMnKJQ&usqp=CAU","Spanch Bob",9))
        navList.add(NavigationComponents("Alive","https://i.pinimg.com/originals/b8/10/e3/b810e3b20a5167598122f76fc171c574.jpg","Tomas Shelby",10))

    }
    fun onClick(position:Int){
        findNavController().navigate(MainFragmentDirections.actionMainFragmentToSecondFragment(navList[position].positionNum.toString().toInt()))

      //  findNavController().navigate(R.id.secondFragment, bundleOf(KEY_FOR_FRAGMENT_ALIVE to navList[positioon].positionNum)
           // bundleOf(KEY_FOR_FRAGMENT_NAME to navList[positioon].name), )

    }


}