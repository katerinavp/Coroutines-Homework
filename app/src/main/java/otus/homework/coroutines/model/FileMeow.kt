package otus.homework.coroutines.model

import com.google.gson.annotations.SerializedName


data class FileMeow(

    @field:SerializedName("file")
    val file: String,
)