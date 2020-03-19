package com.mercadopago.android.px.internal.features.payment_result.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import com.mercadolibre.android.ui.widgets.MeliButton
import com.mercadopago.android.px.R

class PaymentResultFooter(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
    LinearLayout(context, attrs, defStyleAttr) {

    init {
        configureView(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context) : this(context, null)

    private fun configureView(context: Context) {
        orientation = VERTICAL
        View.inflate(context, R.layout.px_payment_result_footer, this)
        findViewById<MeliButton>(R.id.action_loud).setBackgroundResource(R.color.px_quiet_button)
    }
}