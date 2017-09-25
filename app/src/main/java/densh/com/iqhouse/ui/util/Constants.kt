package densh.com.iqhouse.ui.util

import android.content.Context
import android.content.Context.WINDOW_SERVICE
import android.view.WindowManager

/**
 * Created by denglob on 9/10/17.
 */
var context: Context? = null
val DEFAULT_WEIGHT = 3
val HEXAGON_INNER_RADIUS_DP = sizeOfScreen(context)
val HEXAGON_EXTERIOR_RADIUS_DP = ((HEXAGON_INNER_RADIUS_DP * 2)/Math.sqrt(3.0)).toInt()
val HEXAGON_MARGIN_DP = 8

val SECOND_PART_SPACING = HEXAGON_INNER_RADIUS_DP / 4
val FIRST_PART_SPACING = HEXAGON_EXTERIOR_RADIUS_DP

val HEXAGON_HEIGHT = HEXAGON_EXTERIOR_RADIUS_DP * 2
val HEXAGON_WIDTH= HEXAGON_INNER_RADIUS_DP * 2

fun sizeOfScreen (c: Context?): Int {
    if (c != null) {
        return (c.getSystemService(WINDOW_SERVICE) as WindowManager).defaultDisplay.width
    }
    return 50
}
