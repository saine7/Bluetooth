package com.gayedesign.alagiesaine.learnbasics;


import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Locale;


public class CapitalLetters extends AppCompatActivity {
    TextToSpeech capitalLetters;
    Button ReadAllButton,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,RR,S,T,U,V,W,X,Y,Z;
    float speechRate = 0.01f;
/*
    public CapitalLetters() {
        // Required empty public constructor
    }
*/
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_capital_letters);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ReadAllButton = (Button) findViewById(R.id.ReadAllButton);
        A = (Button) findViewById(R.id.AButton);
        B = (Button) findViewById(R.id.BButton);
        C = (Button) findViewById(R.id.CButton);
        D = (Button) findViewById(R.id.DButton);
        E = (Button) findViewById(R.id.EButton);
        F = (Button) findViewById(R.id.FButton);
        G = (Button) findViewById(R.id.GButton);
        H = (Button) findViewById(R.id.HButton);
        I = (Button) findViewById(R.id.IButton);
        J = (Button) findViewById(R.id.JButton);
        K = (Button) findViewById(R.id.KButton);
        L = (Button) findViewById(R.id.LButton);
        M = (Button) findViewById(R.id.MButton);
        N = (Button) findViewById(R.id.NButton);
        O = (Button) findViewById(R.id.OButton);
        P = (Button) findViewById(R.id.PButton);
        Q = (Button) findViewById(R.id.QButton);
        RR = (Button) findViewById(R.id.RButton);
        S = (Button) findViewById(R.id.SButton);
        T = (Button) findViewById(R.id.TButton);
        U = (Button) findViewById(R.id.UButton);
        V = (Button) findViewById(R.id.VButton);
        W = (Button) findViewById(R.id.WButton);
        X = (Button) findViewById(R.id.XButton);
        Y = (Button) findViewById(R.id.YButton);
        Z = (Button) findViewById(R.id.ZButton);

        capitalLetters = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR){
                    capitalLetters.setLanguage(Locale.US);
                    capitalLetters.setSpeechRate(speechRate);
                }
            }
        });
        ReadAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String capitalLettersToRead = "A  B  C  D  E  F  G  H  I  J  K  L  M  N  O P  Q  R  S  T  U  V  W  X  Y  Z";
                capitalLetters.speak(capitalLettersToRead,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("A",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("B",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("C",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("D",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("E",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("F",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("G",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("H",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("I",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("J",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("K",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("L",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("M",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("N",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("O",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("P",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("Q",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        RR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("R",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("S",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("T",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        U.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("U",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("V",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        W.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("W",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("X",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        Y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("Y",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        Z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitalLetters.speak("Z",TextToSpeech.QUEUE_FLUSH,null);
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(capitalLetters != null){
            capitalLetters.stop();
            capitalLetters.shutdown();
        }
    }
}
