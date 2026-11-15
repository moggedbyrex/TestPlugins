package com.example

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*

class RexaAZTV : MainAPI() {
    override var mainUrl = "https://aztv.az/"
    override var name = "rexazedepo"
    override val supportedTypes = setOf(TvType.Live)
    override var lang = "az"
    override val hasMainPage = true

    override suspend fun load(url: String): LoadResponse? {
        return newLiveStreamLoadResponse(
            name,
            url,
            url
        ) {
            this.posterUrl = "https://files.catbox.moe/tkipct.jpg"
        }
    }

    override suspend fun search(query: String): List<SearchResponse> {
        return emptyList()
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        callback(
            newExtractorLink(
                source = name,
                name = name,
                url = "https://str.yodacdn.net/aztv/index.m3u8",
                type = ExtractorLinkType.M3U8
            )
        )
        return true
    }
}
