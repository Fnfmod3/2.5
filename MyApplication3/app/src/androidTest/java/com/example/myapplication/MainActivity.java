package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.textView);

        String poem = "У Лукоморья дуб зелёный";
        int charCount = poem.length();

        String[] words = poem.split(" ");
        int wordCount = words.length;

        int lCount = 0;
        for (int i = 0; i < poem.length(); i++) {
            if (poem.charAt(i) == 'л') {
                lCount++;
            }
        }

        StringBuilder wordsWithA = new StringBuilder();
        for (String word : words) {
            if (word.length() == 5) {
            }
            if (word.startsWith("а") || word.startsWith("А")) {
                wordsWithA.append(word).append(" ");
            }
        }

        String result = "Количество символов: " + charCount + "\n" +
                "Количество слов: " + wordCount + "\n" +
                "Количество букв 'л': " + lCount + "\n" +
                "Слова из 5 букв: ... " + "\n" + 
                "Слова на 'а': " + wordsWithA.toString();
        textViewResult.setText(result);
    }
}
