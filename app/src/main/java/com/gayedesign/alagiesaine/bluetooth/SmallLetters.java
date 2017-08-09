package com.gayedesign.alagiesaine.learnbasics;


import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Locale;


public class SmallLetters extends AppCompatActivity {
    TextToSpeech smallLetters;
    Button readAllButton,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,rr,s,t,u,v,w,x,y,z;
    float speechRate = 0.01f;
    /*
        public CapitalLetters() {
            // Required empty public constructor
        }
    */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_small_letters);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        readAllButton = (Button) findViewById(R.id.readAllButton);
        a = (Button) findViewById(R.id.aButton);
        b = (Button) findViewById(R.id.bButton);
        c = (Button) findViewById(R.id.cButton);
        d = (Button) findViewById(R.id.dButton);
        e = (Button) findViewById(R.id.eButton);
        f = (Button) findViewById(R.id.fButton);
        g = (Button) findViewById(R.id.gButton);
        h = (Button) findViewById(R.id.hButton);
        i = (Button) findViewById(R.id.iButton);
        j = (Button) findViewById(R.id.jButton);
        k = (Button) findViewById(R.id.kButton);
        l = (Button) findViewById(R.id.lButton);
        m = (Button) findViewById(R.id.mButton);
        n = (Button) findViewById(R.id.nButton);
        o = (Button) findViewById(R.id.oButton);
        p = (Button) findViewById(R.id.pButton);
        q = (Button) findViewById(R.id.qButton);
        rr = (Button) findViewById(R.id.rButton);
        s = (Button) findViewById(R.id.sButton);
        t = (Button) findViewById(R.id.tButton);
        u = (Button) findViewById(R.id.uButton);
        v = (Button) findViewById(R.id.vButton);
        w = (Button) findViewById(R.id.wButton);
        x = (Button) findViewById(R.id.xButton);
        y = (Button) findViewById(R.id.yButton);
        z = (Button) findViewById(R.id.zButton);

        smallLetters = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR){
                    smallLetters.setLanguage(Locale.US);
                    smallLetters.setSpeechRate(speechRate);
                }
            }
        });

        readAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smallLettersToRead = "a b c d e f g h i j k l m n o p  q r s t u v w x y z";
                smallLetters.speak(smallLettersToRead,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("a",TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("b",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("c",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("d",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("e",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("f",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("g",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("h",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("i",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("j",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("k",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("l",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("m",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("n",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("o",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("p",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("q",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("r",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("s",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("t",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("u",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("v",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("w",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("x",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("y",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smallLetters.speak("z",TextToSpeech.QUEUE_FLUSH,null);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(smallLetters != null){
            smallLetters.stop();
            smallLetters.shutdown();
        }
    }
}
