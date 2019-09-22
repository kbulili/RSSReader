package com.example.rssreader

import java.util.*

data class Article(val title: String, val link: String, val pubData: Date)

data class Rss(val title: String,
               val pubData: Date, val article: List<Article>)