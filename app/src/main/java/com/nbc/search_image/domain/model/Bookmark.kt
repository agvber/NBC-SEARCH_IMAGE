package com.nbc.search_image.domain.model

import java.time.LocalDateTime

data class Bookmark(
    val id: String,
    val title: String,
    val dateTime: LocalDateTime,
    val image: Image,
)