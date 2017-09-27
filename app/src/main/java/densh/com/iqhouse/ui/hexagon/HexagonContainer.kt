package densh.com.iqhouse.ui.hexagon

import android.content.Context
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import densh.com.iqhouse.app.convertDpToPixel

/**
 * Created by denglob on 9/9/17.
 */
class HexagonContainer {

    lateinit var background: ImageView
    lateinit var content: TextView

    constructor(background: ImageView) {
        this.background = background
    }

    constructor(content: TextView) {
        this.content = content
    }

    constructor(background: ImageView, content: TextView) {
        this.background = background
        this.content = content
    }

    fun addToView(parentView: ViewGroup) {
        parentView.addView(background)
        parentView.addView(content)
    }

    fun setSize(width: Float, height: Float, context: Context) {

        background.layoutParams = ViewGroup.LayoutParams(convertDpToPixel(width, context).toInt(), convertDpToPixel(height, context).toInt())

        content.layoutParams = ViewGroup.LayoutParams(convertDpToPixel(width, context).toInt(), convertDpToPixel(height, context).toInt())
    }

    fun setPosition(x: Float, y: Float) {
        background.x = x
        background.y = y

        content.x = x
        content.y = y
    }
}