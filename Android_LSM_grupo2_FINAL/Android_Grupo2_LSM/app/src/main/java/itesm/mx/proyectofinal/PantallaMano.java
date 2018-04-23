package itesm.mx.proyectofinal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import itesm.mx.proyectofinal.extras.IMyScreen;

/**
 * Created by 59159 on 16/04/2018.
 */

public class PantallaMano extends Fragment implements View.OnClickListener {
    TextView text;
    String letraactual="a";
    int puntos=0;
   String dedo1b="true";
    String dedo2b="true";
    String dedo3b="true";
    String dedo4b="true";
    String dedo5b="true";

    Button boton;
    Button botondedo1;
    Button botondedo2;
    Button botondedo3;
    Button botondedo4;
    Button botondedo5;
    Activity a;
    int dedomovido=0;
    int dedoanterior=0;
    IMyScreen userScreen;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        return inflater.inflate(R.layout.layout_mano, container, false);
    }

    @Override
    public void onActivityCreated(Bundle b) {
        super.onActivityCreated(b);
       //boton= a.findViewById(R.id.botonmanoA);
       botondedo1=a.findViewById(R.id.botondedo1);
       botondedo2=a.findViewById(R.id.botondedo2);
       botondedo3=a.findViewById(R.id.botondedo3);
       botondedo4=a.findViewById(R.id.botondedo4);
       botondedo5=a.findViewById(R.id.botondedo5);
//        boton.setOnClickListener(this);
        botondedo1.setOnClickListener(this);
        botondedo2.setOnClickListener(this);
        botondedo3.setOnClickListener(this);
        botondedo4.setOnClickListener(this);
        botondedo5.setOnClickListener(this);
        juega();

    }
    //miriam baez
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //case R.id.botonmanoA:
              //  cambiarimagen();
                //break;
            case R.id.botondedo1:
                if(dedo1b=="false"){dedo1b="true";}else{dedo1b="false";}
                cambiarimagen();
                juega();
                break;
            case R.id.botondedo2:
                if(dedo2b=="false"){dedo2b="true";}else{dedo2b="false";}
                dedomovido=2;
                cambiarimagen();
                juega();
                break;
            case R.id.botondedo3:
                if(dedo3b=="false"){dedo3b="true";}else{dedo3b="false";};
                dedomovido=3;
                cambiarimagen();
                juega();
                break;
            case R.id.botondedo4:
                if(dedo4b=="false"){dedo4b="true";}else{dedo4b="false";}
                dedomovido=4;
                cambiarimagen();
                juega();
                break;
            case R.id.botondedo5:
                if(dedo5b=="false"){dedo5b="true";}else{dedo5b="false";}
                dedomovido=5;
                cambiarimagen();
                juega();
                break;

            default:
                // Try catch vacio. Adrmiralo un momento
                try {
                    throw new Exception("No existe el boton: " + v.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
    }


    @Override
    public void onAttach(Context con) {
        super.onAttach(con);
        a = (Activity) con;
        try {
            userScreen = (IMyScreen) a;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void juega(){


        switch (letraactual) {
            case "a":
                if (dedo1b == "false" && dedo2b == "false" && dedo3b == "false" && dedo4b == "false" && dedo5b == "true") {
                    TextView resultado = (TextView) a.findViewById(R.id.resultado);
                    puntos++;
                    resultado.setText("CORRECTO!! puntos:" + puntos);
                    TextView formaletra = (TextView) a.findViewById(R.id.formaletra);
                    formaletra.setText("forma la letra b");
                    letraactual = "b";

                } else {
                    TextView resultado = (TextView) a.findViewById(R.id.resultado);
                    resultado.setText("ASI NO ES!! puntos:" + puntos);
                }
                ;
                break;
            case "b":
                if (dedo1b == "true" && dedo2b == "true" && dedo3b == "true" && dedo4b == "true" && dedo5b == "false") {
                    TextView resultado = (TextView) a.findViewById(R.id.resultado);
                    puntos++;
                    resultado.setText("CORRECTO!! puntos:" + puntos);
                    TextView formaletra = (TextView) a.findViewById(R.id.formaletra);
                    formaletra.setText("forma la letra e");
                    letraactual = "e";
                }
                ;
                break;
            case "e":
                if (dedo1b == "false" && dedo2b == "false" && dedo3b == "false" && dedo4b == "false" && dedo5b == "false") {
                    TextView resultado = (TextView) a.findViewById(R.id.resultado);
                    puntos++;
                    resultado.setText("CORRECTO!! puntos:" + puntos);
                    TextView formaletra = (TextView) a.findViewById(R.id.formaletra);
                    formaletra.setText("forma la letra i");
                    letraactual = "i";

                } else {
                    TextView resultado = (TextView) a.findViewById(R.id.resultado);
                    resultado.setText("ASI NO ES!! puntos:" + puntos);
                }
                ;
                break;


            case "i":
                if (dedo1b == "true" && dedo2b == "false" && dedo3b == "false" && dedo4b == "false" && dedo5b == "false") {
                    TextView resultado = (TextView) a.findViewById(R.id.resultado);
                    puntos++;
                    resultado.setText("CORRECTO!! puntos:" + puntos);
                    TextView formaletra = (TextView) a.findViewById(R.id.formaletra);
                    formaletra.setText("forma la letra L");
                    letraactual = "L";

                } else {
                    TextView resultado = (TextView) a.findViewById(R.id.resultado);
                    resultado.setText("ASI NO ES!! puntos:" + puntos);
                }
                ;
                break;

            case "L":
                if (dedo1b == "false" && dedo2b == "false" && dedo3b == "false" && dedo4b == "true" && dedo5b == "true") {
                    TextView resultado = (TextView) a.findViewById(R.id.resultado);
                    puntos++;
                    resultado.setText("CORRECTO!! puntos:" + puntos);
                    TextView formaletra = (TextView) a.findViewById(R.id.formaletra);
                    formaletra.setText("forma la letra v");
                    letraactual = "v";

                } else {
                    TextView resultado = (TextView) a.findViewById(R.id.resultado);
                    resultado.setText("ASI NO ES!! puntos:" + puntos);
                }
                ;
                break;


            case "v":
                if (dedo1b == "false" && dedo2b == "false" && dedo3b == "true" && dedo4b == "true" && dedo5b == "false") {
                    TextView resultado = (TextView) a.findViewById(R.id.resultado);
                    puntos++;
                    resultado.setText("CORRECTO!! puntos:" + puntos);
                    TextView formaletra = (TextView) a.findViewById(R.id.formaletra);
                    formaletra.setText("forma la letra w");
                    letraactual = "w";

                } else {
                    TextView resultado = (TextView) a.findViewById(R.id.resultado);
                    resultado.setText("ASI NO ES!! puntos:" + puntos);
                }
                ;
                break;

            case "w":if(dedo1b=="false"&&dedo2b=="true"&&dedo3b=="true"&&dedo4b=="true"&&dedo5b=="false"){
                TextView resultado=(TextView)a.findViewById(R.id.resultado);
                puntos++;
                resultado.setText("CORRECTO!! puntos:"+puntos);
                TextView formaletra=(TextView)a.findViewById(R.id.formaletra);
                formaletra.setText("HAZ GANADO");
                letraactual="HAZ GANADO";
                ///YADEBERIA DE JALAR

            }else { TextView resultado=(TextView)a.findViewById(R.id.resultado);
                resultado.setText("ASI NO ES!! puntos:"+puntos);};
                break;
        }



    }








    public void cambiarimagen(){
        ImageView imagenmano=a.findViewById(R.id.imagenmano);
        switch (dedo1b){
            case "true": {

                switch (dedo2b){

                    case "true":{
                        switch (dedo3b){
                            case "true":{//3
                                switch (dedo4b){
                                    case "true":{//4

                                        switch (dedo5b){

                                            case "true":{//5
                                                //true.true.true.true.true
                                                //manocerrada
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.ttttt);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                            case "false":{//5
                                                //true.true.true.true.false
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.ttttf);
                                                imagenmano.setImageBitmap(bimage);


                                            };break;//4
                                        };

                                    };break;//3



                                    case "false":{//4
                                        switch (dedo5b){

                                            case "true":{//5
                                                //true,true,true.false,true
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.tttft);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                            case "false":{//5
                                                //true,true,true,false,false
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.tttff);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                        };

                                    };break;


                                }
                            };break;




                            case "false":{//3
                                switch (dedo4b){
                                    case "true":{//4

                                        switch (dedo5b){

                                            case "true":{//5
                                                //true,true,false,true,true
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.ttftt);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                            case "false":{//5
                                                //true.true,false,true,false
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.ttftf);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                        };

                                    };break;//5



                                    case "false":{//4  //3 es false
                                        switch (dedo5b){

                                            case "true":{//5
                                                //ttfft
                                                //tru true false false true
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.ttfft);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                            case "false":{//5
                                                //true true false false false
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.ttfff);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;//5
                                        };

                                    };break;//5


                                }
                            };break;//4

                        }

                    };break;//3

                    //empieza 2 falso
                     case "false":{//2 es falso
                        switch (dedo3b){
                            case "true":{//3
                                switch (dedo4b){
                                    case "true":{//4

                                        switch (dedo5b){

                                            case "true":{//5
                                                //tfttt
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.tfttt);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                            case "false":{//5
                                                //tfttf
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.tfttf);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;//4
                                        };

                                    };break;//3



                                    case "false":{//4    //2esfalseo  //3 es true
                                        switch (dedo5b){

                                            case "true":{//5
                                                //tftft
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.tftft);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                            case "false":{//5
                                                //tftff
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.tftff);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                        };

                                    };break;


                                }
                            };break;



//2 es falso
                            case "false":{//3
                                switch (dedo4b){
                                    case "true":{//4

                                        switch (dedo5b){

                                            case "true":{//5
                                                //tfftt
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.tfftt);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                            case "false":{//5
                                                //tfftf
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.tfftf);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                        };

                                    };break;//5

//2 y 3 son falsos

                                    case "false":{//4
                                        switch (dedo5b){

                                            case "true":{//5
                                                //tffft
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.tffft);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                            case "false":{//5
                                                //tffff
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.tffff);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;//5
                                        };

                                    };break;//5


                                }
                            };break;//4

                        }


                         };break;//3
                };

            };
                break;
            case "false":{//dedo1
                //DEDO 1 FALSO
                switch (dedo2b){

                    case "true":{
                        switch (dedo3b){
                            case "true":{//3
                                switch (dedo4b){
                                    case "true":{//4

                                        switch (dedo5b){

                                            case "true":{//5
                                                //ftttt
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.ftttt);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                            case "false":{//5
                                                //ftttf
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.ftttf);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;//4
                                        };

                                    };break;//3



                                    case "false":{//4

                                        //1false 2true  3true

                                        switch (dedo5b){

                                            case "true":{//5
                                                //fttft
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.fttft);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                            case "false":{//5
                                                //fttff
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.fttff);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                        };

                                    };break;


                                }
                            };break;




                            case "false":{//3
                                switch (dedo4b){
                                    case "true":{//4

                                        switch (dedo5b){
                                        //1false 2true  3false
                                            case "true":{//5
                                                    //ftftt
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.ftftt);
                                                imagenmano.setImageBitmap(bimage);


                                            };break;
                                            case "false":{//5
                                                //ftftf
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.ftftf);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                        };

                                    };break;//5



                                    case "false":{//4
                                        switch (dedo5b){
                                            //1f 2t 3f 4f

                                            case "true":{//5
                                                //ftfft
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.ftfft);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                            case "false":{//5
                                                //ftfff
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.ftfff);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;//5
                                        };

                                    };break;//5


                                }
                            };break;//4

                        }

                    };break;//3



                    case "false":{//2
                        switch (dedo3b){
                            case "true":{//3
                                switch (dedo4b){
                                    case "true":{//4

                                        switch (dedo5b){
                                            //1f 2f 3t 4t
                                            case "true":{//5
                                                //ffttt
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.ffttt);
                                                imagenmano.setImageBitmap(bimage);


                                            };break;
                                            case "false":{//5
                                                //ffttf
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.ffttf);
                                                imagenmano.setImageBitmap(bimage);


                                            };break;//4
                                        };

                                    };break;//3



                                    case "false":{//4    //fftf
                                        switch (dedo5b){

                                            case "true":{//5
                                                //fftft
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.fftft);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                            case "false":{//5
                                                //fftff
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.fftff);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                        };

                                    };break;


                                }
                            };break;




                            case "false":{//3
                                switch (dedo4b){
                                    case "true":{//4
                                        //fff
                                        switch (dedo5b){
//                                              ffft
                                            case "true":{//5
                                                    //ffftt
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.ffftt);
                                                imagenmano.setImageBitmap(bimage);


                                            };break;
                                            case "false":{//5
                                                    //ffftf
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.ffftf);
                                                imagenmano.setImageBitmap(bimage);
                                            };break;
                                        };

                                    };break;//5



                                    case "false":{//4
                                        //ffff
                                        switch (dedo5b){

                                            case "true":{//5
                                                //fffft
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.fffft);
                                                imagenmano.setImageBitmap(bimage);

                                            };break;
                                            case "false":{//5
                                                Bitmap bimage= BitmapFactory.decodeResource(this.getResources(),R.drawable.fffff);
                                                imagenmano.setImageBitmap(bimage);
                                                //fffff

                                            };break;//5
                                        };

                                    };break;//5


                                }
                            };break;//4

                        }


                    };break;//3
                };//2



            };//1
                break;





        }






    }

}