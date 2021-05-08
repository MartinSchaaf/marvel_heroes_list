package com.schaaf.marvelheroeslist.data.heroes_list.model

import com.google.gson.annotations.SerializedName

data class HeroesListResponse(
    @SerializedName("code")
    val code: Int? = null,
    @SerializedName("status")
    val status: String? = null,
    @SerializedName("copyright")
    val copyright: String? = null,
    @SerializedName("attributionText")
    val attributionText: String? = null,
    @SerializedName("attributionHTML")
    val attributionHTML: String? = null,
    @SerializedName("etag")
    val etag: String? = null,
    @SerializedName("data")
    val `data`: Data? = null
) {
    data class Data(
        @SerializedName("offset")
        val offset: Int? = null,
        @SerializedName("limit")
        val limit: Int? = null,
        @SerializedName("total")
        val total: Int? = null,
        @SerializedName("count")
        val count: Int? = null,
        @SerializedName("results")
        val results: List<Result?>? = null
    ) {
        data class Result(
            @SerializedName("id")
            val id: Int? = null,
            @SerializedName("name")
            val name: String? = null,
            @SerializedName("description")
            val description: String? = null,
            @SerializedName("modified")
            val modified: String? = null,
            @SerializedName("thumbnail")
            val thumbnail: Thumbnail? = null,
            @SerializedName("resourceURI")
            val resourceURI: String? = null,
            @SerializedName("comics")
            val comics: Comics? = null,
            @SerializedName("series")
            val series: Series? = null,
            @SerializedName("stories")
            val stories: Stories? = null,
            @SerializedName("events")
            val events: Events? = null,
            @SerializedName("urls")
            val urls: List<Url?>? = null
        ) {
            data class Thumbnail(
                @SerializedName("path")
                val path: String? = null,
                @SerializedName("extension")
                val extension: String? = null
            )

            data class Comics(
                @SerializedName("available")
                val available: Int? = null,
                @SerializedName("collectionURI")
                val collectionURI: String? = null,
                @SerializedName("items")
                val items: List<Item?>? = null,
                @SerializedName("returned")
                val returned: Int? = null
            ) {
                data class Item(
                    @SerializedName("resourceURI")
                    val resourceURI: String? = null,
                    @SerializedName("name")
                    val name: String? = null
                )
            }

            data class Series(
                @SerializedName("available")
                val available: Int? = null,
                @SerializedName("collectionURI")
                val collectionURI: String? = null,
                @SerializedName("items")
                val items: List<Item?>? = null,
                @SerializedName("returned")
                val returned: Int? = null
            ) {
                data class Item(
                    @SerializedName("resourceURI")
                    val resourceURI: String? = null,
                    @SerializedName("name")
                    val name: String? = null
                )
            }

            data class Stories(
                @SerializedName("available")
                val available: Int? = null,
                @SerializedName("collectionURI")
                val collectionURI: String? = null,
                @SerializedName("items")
                val items: List<Item?>? = null,
                @SerializedName("returned")
                val returned: Int? = null
            ) {
                data class Item(
                    @SerializedName("resourceURI")
                    val resourceURI: String? = null,
                    @SerializedName("name")
                    val name: String? = null,
                    @SerializedName("type")
                    val type: String? = null
                )
            }

            data class Events(
                @SerializedName("available")
                val available: Int? = null,
                @SerializedName("collectionURI")
                val collectionURI: String? = null,
                @SerializedName("items")
                val items: List<Item?>? = null,
                @SerializedName("returned")
                val returned: Int? = null
            ) {
                data class Item(
                    @SerializedName("resourceURI")
                    val resourceURI: String? = null,
                    @SerializedName("name")
                    val name: String? = null
                )
            }

            data class Url(
                @SerializedName("type")
                val type: String? = null,
                @SerializedName("url")
                val url: String? = null
            )
        }
    }
}