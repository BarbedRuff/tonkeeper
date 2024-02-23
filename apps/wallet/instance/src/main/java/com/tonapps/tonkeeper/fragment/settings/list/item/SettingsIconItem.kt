package com.tonapps.tonkeeper.fragment.settings.list.item

import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import com.tonapps.uikit.icon.UIKitIcon
import com.tonapps.uikit.list.ListCell

data class SettingsIconItem(
    override val id: Int,
    val titleRes: Int,
    @DrawableRes val iconRes: Int = UIKitIcon.ic_chevron_right_16,
    val secondaryIcon: Boolean = false,
    override val position: ListCell.Position,
    val dot: Boolean = false
): SettingsIdItem(ICON_TYPE, id), ListCell