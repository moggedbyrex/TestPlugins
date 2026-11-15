package com.example

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.TvType

class RexaAZTV : MainAPI() {
    override var mainUrl = "https://example.com/"
    override var name = "rexazedepo"
    override val supportedTypes = setOf(TvType.Live)

    override var lang = "az"
    override val hasMainPage = false

    override suspend fun search(query: String): List<SearchResponse> {
        return emptyList()
    }
}
