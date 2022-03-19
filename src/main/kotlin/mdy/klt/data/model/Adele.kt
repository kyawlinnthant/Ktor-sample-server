package mdy.klt.data.model

@kotlinx.serialization.Serializable
data class Adele(
    val songName: String,
    val description: String,
    val imageUrl: String
)
