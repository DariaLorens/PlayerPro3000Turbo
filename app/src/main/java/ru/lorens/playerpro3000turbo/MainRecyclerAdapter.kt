package ru.lorens.playerpro3000turbo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainRecyclerAdapter(var items: List<String>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = when (viewType) {
        TYPE_PLAYLIST -> PlaylistsHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.playlists_element, parent, false)
        )
        TYPE_SONG -> SongsHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.song_element, parent, false)
        )
        else -> throw IllegalArgumentException()
    }

    override fun getItemCount() = items.size + 1

    override fun getItemViewType(position: Int): Int =
        when (position) {
            0 -> TYPE_PLAYLIST
            else -> TYPE_SONG
        }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        when (holder.itemViewType) {
            TYPE_PLAYLIST -> onBindPlaylist(holder)
            TYPE_SONG -> onBindSong(holder, items[position - 1])
            else -> throw IllegalArgumentException()
        }

    private fun onBindPlaylist(holder: RecyclerView.ViewHolder) {
        val playlistsHolder = holder as PlaylistsHolder
        playlistsHolder.recyclerPlaylists.adapter
    }

    private fun onBindSong(holder: RecyclerView.ViewHolder, item: String) {
//        (holder as SongsHolder).messageView.text = row.message
    }

    inner class PlaylistsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val recyclerPlaylists = itemView.findViewById<RecyclerView>(R.id.recyclerPlaylists)
    }

    inner class SongsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    companion object {
        private const val TYPE_PLAYLIST = 0
        private const val TYPE_SONG = 1
    }
}