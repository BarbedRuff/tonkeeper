package com.tonapps.tonkeeper.dialog

import android.content.Context
import android.widget.Button
import com.tonapps.tonkeeperx.R
import com.tonapps.tonkeeper.ui.screen.init.InitAction
import com.tonapps.tonkeeper.ui.screen.init.InitFragment
import uikit.base.BaseSheetDialog
import uikit.navigation.Navigation.Companion.navigation

class IntroWalletDialog(context: Context): BaseSheetDialog(context) {

    private val importWalletDialog: ImportWalletDialog by lazy {
        ImportWalletDialog(context)
    }

    init {
        setContentView(R.layout.dialog_start)

        val newWalletButton = findViewById<Button>(R.id.new_wallet)!!
        newWalletButton.setOnClickListener {
            newWallet()
        }

        val importWalletButton = findViewById<Button>(R.id.import_wallet)!!
        importWalletButton.setOnClickListener {
            importWallet()
        }
    }

    private fun newWallet() {
        dismiss()
        navigation?.add(InitFragment.newInstance(InitAction.Create))
    }

    private fun importWallet() {
        dismiss()
        importWalletDialog.show()
    }
}