package com.erkan

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class IzleOrgPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(IzleOrg())
    }
}