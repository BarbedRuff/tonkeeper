/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.tonapi.models

import io.tonapi.models.BlockCurrencyCollectionOtherInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param grams 
 * @param other 
 */


data class BlockCurrencyCollection (

    @Json(name = "grams")
    val grams: kotlin.Long,

    @Json(name = "other")
    val other: kotlin.collections.List<BlockCurrencyCollectionOtherInner>

)
