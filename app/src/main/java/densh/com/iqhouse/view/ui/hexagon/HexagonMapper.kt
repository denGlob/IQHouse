package densh.com.iqhouse.view.ui.hexagon

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.support.v4.view.ViewCompat
import android.view.Gravity
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import densh.com.iqhouse.R
import densh.com.iqhouse.view.models.HexagonModel
import densh.com.iqhouse.view.models.hexagon.HouseholdTypes.*
import densh.com.iqhouse.view.ui.util.*

/**
 * Created by denglob on 9/10/17.
 */
class HexagonMapper (val models: List<HexagonModel>, val context: Context){

    private val conteiners = ArrayList<HexagonContainer>()

    private fun mapPart(containers: List<HexagonContainer>) {
        var x = 0.0F
        var y = 0.0F
        var offset = 0.0F
        var off = 0.0F
        for (container in containers) {
            setPosition(container, (x * HEXAGON_WIDTH + HEXAGON_MARGIN_DP * offset),
                    y * HEXAGON_HEIGHT + HEXAGON_MARGIN_DP * off)
            if (x < DEFAULT_WEIGHT - 1 && x < DEFAULT_WEIGHT - 1.5F) {
                x = x.inc()
                offset = offset.inc()
            }
            else if (x == (DEFAULT_WEIGHT - 1).toFloat()) {
                x = 0.5F
                y += 0.75F
                offset = 0.5F
                off = off.inc()
            }
            else if (x == DEFAULT_WEIGHT - 1.5F) {
                x = 0.0F
                y += 0.75F
                offset = 0.0F
                off = off.inc()
            }
        }
    }

    private fun doMap(model: HexagonModel, container: HexagonContainer) {
        if (model.state) {
            when(model.type) {
                AIR_CONDITIONER -> configContainer(container, Color.CYAN, model.descriptor)
                LAMP            -> configContainer(container, Color.YELLOW, model.descriptor)
                GATE            -> configContainer(container, Color.BLACK, model.descriptor)
                TV              -> configContainer(container, Color.RED, model.descriptor)
                KETTLE          -> configContainer(container, Color.BLUE, model.descriptor)
                ROSETTE         -> configContainer(container, Color.GREEN, model.descriptor)
            }
        }
        else {
            configContainer(container, Color.LTGRAY, model.descriptor)
        }
    }

    private fun configContainer(container: HexagonContainer, color: Int, description: String) {
        container.background.setBackgroundResource(R.drawable.ic_hexagon)
        ViewCompat.setBackgroundTintList(container.background, ColorStateList.valueOf(color))
        container.content.text = description
        container.content.textSize = 14F
        container.content.gravity = Gravity.CENTER
        container.content.setTextColor(Color.WHITE)
        container.setSize(HEXAGON_WIDTH.toFloat(), HEXAGON_HEIGHT.toFloat(), context)
    }

    private fun setPosition(container: HexagonContainer, x: Float, y: Float) {
        val absoluteX = convertDpToPixel(x, context)
        val absoluteY = convertDpToPixel(y, context)
        container.setPosition(absoluteX, absoluteY)
    }


    fun mapping(viewGroup: ViewGroup) {
        for (model in models) {
            val container = HexagonContainer(ImageView(context), TextView(context))
            doMap(model, container)
            conteiners.add(container)
            container.addToView(viewGroup)
        }
        mapPart(conteiners)
    }
}