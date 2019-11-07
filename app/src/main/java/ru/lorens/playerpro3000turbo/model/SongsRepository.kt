package ru.lorens.playerpro3000turbo.model

data class Songs(
    val id: Int,
    val name: String,
    val image: String,
    val artist: Artist,
    val albums: List<Album>?
)

object SongsRepository {
    val songsList = listOf<Songs>(
        Songs(
            id = 1,
            name = "Natural Blues",
            image = "https://lh3.googleusercontent.com/VBivB5k2zNvatmCLKPMiFaYXR9iIU6TF8JGrlT0UMi3eLr2q77yrPfior2YpICxwl8Ie_Bi3hw=s512-c-e100-rwu-v1",
            artist = ArtistRepository.getArtistByid(1),
            albums = null
        ),
        Songs(
            id = 2,
            name = "Tessellate",
            image = "https://lh3.googleusercontent.com/TbICS2jkDRTNFKPzoz0rLr2SmCRxR4rJvFrILDXR3uqSYOKeTODtH1hKPwW7hiRu8KIZjo0u=s512-c-e100-rwu-v1",
            artist = ArtistRepository.getArtistByid(2),
            albums = null
        ),
        Songs(
            id = 3,
            name = "Every You Every Me",
            image = "https://lh3.ggpht.com/qVSyoZ1ZjVPCibLPpLJVyExbfWOpAt1obTp6GJezRkH2rCB30ctv8V4JhiCRyh1Xade7RgajOVQ=s512-c-e100-rwu-v1",
            artist = ArtistRepository.getArtistByid(3),
            albums = null
        ),
        Songs(
            id = 4,
            name = "In the Cold Light of Morning",
            image = "https://lh4.ggpht.com/xzfA9zeC4k2pJtZ4SCX7XX_sc7fRbuOxxtZYSUOR-bNJrpvPHZzFLHDjUCy213w9xBuzEXxl_w=s512-c-e100-rwu-v1",
            artist = ArtistRepository.getArtistByid(3),
            albums = null
        ),
        Songs(
            id = 5,
            name = "Closer",
            image = "https://lh3.googleusercontent.com/8WAvXT3zl7FxmHcQliCH1DFFCcK02WX7CPJ3ifXHfIKIqMI_GCSCynVdEE95x9HsnqTwU7fBog=s512-c-e100-rwu-v1",
            artist = ArtistRepository.getArtistByid(4),
            albums = null
        ),
        Songs(
            id = 6,
            name = "Pygmalion",
            image = "https://lh3.googleusercontent.com/q_DXaGCZwP-r02tQXq4xyoTZqw16C7AzVS3nZhU-mocEzRZhvmXaw8UYxPppQOMj49SJnxCdTg=s512-c-e100-rwu-v1",
            artist = ArtistRepository.getArtistByid(5),
            albums = null
        )
    )
}