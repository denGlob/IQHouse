package densh.com.iqhouse.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.RelativeLayout

import densh.com.iqhouse.R
import densh.com.iqhouse.view.models.HexagonModel
import densh.com.iqhouse.view.ui.hexagon.HexagonMapper

import densh.com.iqhouse.view.models.hexagon.HouseholdTypes.*

class MainActivity : AppCompatActivity() {

    lateinit var content: RelativeLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        content = findViewById(R.id.content) as RelativeLayout

        val models = ArrayList<HexagonModel>()

        models.add(HexagonModel("LOL", true, LAMP))
        models.add(HexagonModel("KEK", false, AIR_CONDITIONER))
        models.add(HexagonModel("LAMP", false, GATE))
        models.add(HexagonModel("CHEBUREK", true, LAMP))
        models.add(HexagonModel("AHAHHA", true, KETTLE))
        models.add(HexagonModel("LAMP", true, AIR_CONDITIONER))
        models.add(HexagonModel("KIKKK", false, ROSETTE))
        models.add(HexagonModel("KION", false, TV))
        models.add(HexagonModel("RE:ZERO", false, ROSETTE))
        models.add(HexagonModel("ERGO", true, LAMP))
        models.add(HexagonModel("PROXY", true, TV))
        models.add(HexagonModel("PP", false, GATE))
        models.add(HexagonModel("ookoko", true, ROSETTE))

        val mapper = HexagonMapper(models, this)
        mapper.mapping(content)

    }
}
