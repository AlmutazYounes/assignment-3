package com.example.assignment_3
import android.graphics.Color

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextVersion: EditText = findViewById(R.id.editTextText)
        val editTextCodeName: EditText = findViewById(R.id.editTextText2)
        val addButton: Button = findViewById(R.id.button4)
        val tableLayout: TableLayout = findViewById(R.id.tableLayout)

        addButton.setOnClickListener {
            val tableRow = TableRow(this) // this

            // Create TextViews for the version and code name
            val versionTextView = TextView(this)
            val codeNameTextView = TextView(this)

            // Set the text for both TextViews
            versionTextView.text = editTextVersion.text.toString()
            codeNameTextView.text = editTextCodeName.text.toString()

            // Set layout parameters for the TextViews to control their size, weight, etc.
            // This ensures both TextViews take equal space in the TableRow.
            val textViewLayoutParams = TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1f)
            versionTextView.layoutParams = textViewLayoutParams
            codeNameTextView.layoutParams = textViewLayoutParams
            tableRow.setBackgroundColor(Color.parseColor("#E91E63"))
            // Add the TextViews to the TableRow
            tableRow.addView(versionTextView)
            tableRow.addView(codeNameTextView)

            // Finally add the created row to the TableLayout
            tableLayout.addView(tableRow)

            // Clear the EditTexts for next input
            editTextVersion.text.clear()
            editTextCodeName.text.clear()
        }
    }
}
