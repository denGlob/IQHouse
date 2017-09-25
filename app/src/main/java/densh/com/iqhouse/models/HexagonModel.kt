package densh.com.iqhouse.models

import densh.com.iqhouse.models.hexagon.HouseholdTypes

/**
 * Created by denglob on 9/10/17.
 */
data class HexagonModel(val descriptor: String, val state: Boolean, val type: HouseholdTypes)