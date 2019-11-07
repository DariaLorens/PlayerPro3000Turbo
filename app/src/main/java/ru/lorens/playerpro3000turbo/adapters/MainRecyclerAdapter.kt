package ru.lorens.playerpro3000turbo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import ru.lorens.playerpro3000turbo.R
import ru.lorens.playerpro3000turbo.model.Songs

class MainRecyclerAdapter(var items: List<Songs>) :
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

    private fun onBindSong(holder: RecyclerView.ViewHolder, item: Songs) {
        val songssHolder = holder as SongsHolder
        songssHolder.textSongName.text = item.name
        songssHolder.textSongDesc.text = item.artist.name

        Glide.with(songssHolder.songImage.context)
            .load(item.image)
            .transform(CenterCrop(), RoundedCorners(10))
            .into(songssHolder.songImage)
    }

    inner class PlaylistsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val recyclerPlaylists = itemView.findViewById<RecyclerView>(R.id.recyclerPlaylists)
    }

    inner class SongsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val songImage = itemView.findViewById<ImageView>(R.id.songImage)
        val textSongName = itemView.findViewById<TextView>(R.id.textSongName)
        val textSongDesc = itemView.findViewById<TextView>(R.id.textSongDesc)
        val imageDrag = itemView.findViewById<ImageView>(R.id.imageDrag)
    }

    companion object {
        private const val TYPE_PLAYLIST = 0
        private const val TYPE_SONG = 1
    }
}