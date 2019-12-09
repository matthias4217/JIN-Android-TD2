package net.ombre_jin.td2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.tasks_fragment.view.*

class TasksFragment : Fragment() {

    private val tasks = listOf("Task 1", "Task 2", "Task 3")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val adapter = TasksAdapter(tasks)
        val view = inflater.inflate(R.layout.tasks_fragment, container, false)
        view.tasks_recycler_view.adapter = adapter
        view.tasks_recycler_view.layoutManager = LinearLayoutManager(context)
        return view
    }
}