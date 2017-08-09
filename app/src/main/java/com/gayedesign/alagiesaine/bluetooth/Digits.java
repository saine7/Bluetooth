package com.gayedesign.alagiesaine.learnbasics;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class Digits extends AppCompatActivity {
    TextToSpeech numbers;
    Button ReadAllNumbersButton,_1,_2,_3,_4,_5,_6,_7,_8,_9,_10,_11,_12,_13,_14,_15,_16,_17,_18,_19,_20,
            _21,_22,_23,_24,_25,_26,_27,_28,_29,_30;
    float speechRate = 0.01f;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.digits);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ReadAllNumbersButton = (Button) findViewById(R.id.readAllNumbers);
        _1 = (Button) findViewById(R.id._1Button);
        _2= (Button) findViewById(R.id._2Button);
        _3 = (Button) findViewById(R.id._3Button);
        _4 = (Button) findViewById(R.id._4Button);
        _5 = (Button) findViewById(R.id._5Button);
        _6 = (Button) findViewById(R.id._6Button);
        _7 = (Button) findViewById(R.id._7Button);
        _8 = (Button) findViewById(R.id._8Button);
        _9 = (Button) findViewById(R.id._9Button);
        _10 = (Button) findViewById(R.id._10Button);
        _11 = (Button) findViewById(R.id._11Button);
        _12 = (Button) findViewById(R.id._12Button);
        _13 = (Button) findViewById(R.id._13Button);
        _14 = (Button) findViewById(R.id._14Button);
        _15 = (Button) findViewById(R.id._15Button);
        _16 = (Button) findViewById(R.id._16Button);
        _17 = (Button) findViewById(R.id._17Button);
        _18 = (Button) findViewById(R.id._18Button);
        _19 = (Button) findViewById(R.id._19Button);
        _20 = (Button) findViewById(R.id._20Button);
        _21 = (Button) findViewById(R.id._21Button);
        _22 = (Button) findViewById(R.id._22Button);
        _23 = (Button) findViewById(R.id._23Button);
        _24 = (Button) findViewById(R.id._24Button);
        _25 = (Button) findViewById(R.id._25Button);
        _26 = (Button) findViewById(R.id._26Button);
        _27 = (Button) findViewById(R.id._27Button);
        _28 = (Button) findViewById(R.id._28Button);
        _29 = (Button) findViewById(R.id._29Button);
        _30 = (Button) findViewById(R.id._30Button);

        numbers = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR){
                    numbers.setLanguage(Locale.US);
                    numbers.setSpeechRate(speechRate);
                }
            }
        });

        ReadAllNumbersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numbersToRead = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30";
                numbers.speak(numbersToRead,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        _1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("1",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("2",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("3",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("4",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("5",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("6",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("7",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("8",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("9",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("10",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("11",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("12",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("13",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("14",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("15",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("16",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("17",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("18",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("19",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("20",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("21",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("22",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("23",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("24",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("25",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("26",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("27",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("28",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("29",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        _30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.speak("30",TextToSpeech.QUEUE_FLUSH,null);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(numbers != null){
            numbers.stop();
            numbers.shutdown();
        }

    }
}
