package unica.ds4h.miage.donati

import com.google.genai.Client

fun main() {
    val client = Client()

    val response = client.models.generateContent(
        "gemini-2.5-flash",
        "RAconte une histoire d'horreur",
        null
    )

    println(response.text())
}
