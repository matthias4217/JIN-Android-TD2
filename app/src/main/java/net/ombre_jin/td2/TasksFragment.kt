package net.ombre_jin.td2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TasksFragment : Fragment() {

    private val tasks = listOf("Task 1", "Task 2", "Task 3")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val recyclerView = container!!.findViewById<RecyclerView>(R.id.tasks_recycler_view)
        val adapter = TasksAdapter(tasks)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
        return inflater.inflate(R.layout.tasks_fragment, container)
    }
}