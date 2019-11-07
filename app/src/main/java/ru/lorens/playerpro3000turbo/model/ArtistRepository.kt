package ru.lorens.playerpro3000turbo.model

data class Artist(val id: Int, val name: String, val desc: String?)

object ArtistRepository {
    val artistList = listOf<Artist>(
        Artist(
            id = 1,
            name = "Moby",
            desc = "Richard Melville Hall, better known as Moby, is an American musician, songwriter, singer, producer, and animal rights activist. He has sold 20 million records worldwide. AllMusic considers him to be \"among the most important dance music figures of the early 1990s, helping bring dance music to a mainstream audience both in the United Kingdom and the United States\"."
        ),
        Artist(
            id = 2,
            name = "alt-J",
            desc = "alt-J follow up their debut album An Awesome Wave with This Is All Yours. The debut sold over a million copies worldwide and was the 2012 Mercury Prize winner, and the band found themselves at the outset of making a follow up in a new position of recording an album that was actually anticipated, and having gone from a four piece to a trio."
        ),
        Artist(
            id = 3,
            name = "Placebo",
            desc = "Placebo are an English rock band, formed in London in 1994 by vocalist–guitarist Brian Molko and bassist–guitarist Stefan Olsdal. The band were soon joined by drummer Robert Schultzberg, who left in 1996 due to conflicts with Molko and was replaced the same year by Steve Hewitt."
        ),
        Artist(
            id = 4,
            name = "Kings Of Leon",
            desc = "Kings of Leon is an American rock band that formed in Nashville, Tennessee, in 1999. The band is composed of brothers Caleb, Nathan and Jared Followill with their cousin Matthew Followill."
        ),
        Artist(id = 5, name = "Lost In Kiev", desc = null)
    )

    fun getArtistByid(id: Int): Artist {
        return artistList.first { it.id == id }
    }
}