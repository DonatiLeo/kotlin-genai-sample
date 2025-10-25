package unica.ds4h.miage.donati

import com.google.genai.Client

fun main() {
    val client = Client()
    val ModelId = "gemini-2.5-flash"

    val response = client.models.generateContent(
        "gemini-2.5-flash",
        "Explain bubble sort to me.",
        null
    )

    println(response.text())
}
