import org.jetbrains.kotlinx.dataframe.api.dataFrameOf
import org.jetbrains.kotlinx.kandy.dsl.plot
import org.jetbrains.kotlinx.kandy.letsplot.export.save
import org.jetbrains.kotlinx.kandy.letsplot.feature.layout
import org.jetbrains.kotlinx.kandy.letsplot.layers.line

class Diagram {
    fun create() {
        val averageTemperature = dataFrameOf(
            "city" to listOf("New York", "London", "Berlin", "Yerevan", "Tokyo"),
            "average temperature" to listOf(12.5, 11.0, 9.6, 11.5, 16.0)
        )
        averageTemperature.plot {
            line {
                x("city") {
                    axis.name = "City"
                }
                y("average temperature") {
                    axis.name = "Average Temperature (°C)"
                }
            }
            layout.title = "Kandy Getting Started Example"
        }.save("Example.png")
    }
}