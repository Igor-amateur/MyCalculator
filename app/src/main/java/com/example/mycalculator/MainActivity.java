package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;


public class MainActivity extends AppCompatActivity {

    TextView resultTV;

    Button myBtn_0;
    Button myBtn_1;
    Button myBtn_2;
    Button myBtn_3;
    Button myBtn_4;
    Button myBtn_5;
    Button myBtn_6;
    Button myBtn_7;
    Button myBtn_8;
    Button myBtn_9;
    Button myBtn_P;

    Button myDiv;
    Button myMult;
    Button myPow;
    Button myPlus;
    Button myMinus;

    Button mySin;
    Button myCos;
    Button myTng;
    Button myCtn;
    Button myExp;

    Button myBrOP;
    Button myBrCL;
    Button myPoint;
    Button myEqual;
    Button myCE;
    Button myC;

    private Stack<MyState> myStates = new Stack<MyState>();
    private MyState myState = new MyState();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTV = (TextView) findViewById(R.id.result);

        myBtn_0 = (Button) findViewById(R.id.b0);
        myBtn_1 = (Button) findViewById(R.id.b1);
        myBtn_2 = (Button) findViewById(R.id.b2);
        myBtn_3 = (Button) findViewById(R.id.b3);
        myBtn_4 = (Button) findViewById(R.id.b4);
        myBtn_5 = (Button) findViewById(R.id.b5);
        myBtn_6 = (Button) findViewById(R.id.b6);
        myBtn_7 = (Button) findViewById(R.id.b7);
        myBtn_8 = (Button) findViewById(R.id.b8);
        myBtn_9 = (Button) findViewById(R.id.b9);
        myBtn_P  = (Button) findViewById(R.id.bP);

        myDiv = (Button) findViewById(R.id.bDiv);
        myMult = (Button) findViewById(R.id.bMult);
        myPow = (Button) findViewById(R.id.bPow);
        myPlus = (Button) findViewById(R.id.bPlus);
        myMinus = (Button) findViewById(R.id.bMin);

        mySin = (Button) findViewById(R.id.bs);
        myCos = (Button) findViewById(R.id.bc);
        myTng = (Button) findViewById(R.id.bt);
        myCtn = (Button) findViewById(R.id.bg);
        myExp = (Button) findViewById(R.id.be);

        myBrOP = (Button) findViewById(R.id.bBrOp);
        myBrCL = (Button) findViewById(R.id.bBrCl);
        myPoint = (Button) findViewById(R.id.bPoint);
        myEqual = (Button) findViewById(R.id.bEquals);
        myCE = (Button) findViewById(R.id.bCE);
        myC = (Button) findViewById(R.id.bCP);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmpString;

                Calculator calculator = new Calculator();
                switch (view.getId()) {
                    case R.id.b0:
                        //...
                        if (myState.pointUseIsUsed == false
                                && myState.lastIsPi == false) {
                            myState.pointIsUsed = false;

                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            tmpString = tmpString + 0;
                            resultTV.setText(tmpString);
                            myState.lastIsOperation = false;
                        }
                        break;
                    case R.id.b1:
                        if (myState.pointUseIsUsed == false
                                && myState.lastIsPi == false) {
                            myState.pointIsUsed = false;

                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            tmpString = tmpString + 1;
                            resultTV.setText(tmpString);
                            myState.lastIsOperation = false;
                        }
                        break;
                    case R.id.b2:
                        if(myState.pointUseIsUsed == false
                                && myState.lastIsPi == false) {
                            myState.pointIsUsed = false;

                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            tmpString = tmpString + 2;
                            resultTV.setText(tmpString);
                            myState.lastIsOperation = false;
                        }
                        break;
                    case R.id.b3:
                        if(myState.pointUseIsUsed == false
                                && myState.lastIsPi == false) {
                            myState.pointIsUsed = false;

                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            tmpString = tmpString + 3;
                            resultTV.setText(tmpString);
                            myState.lastIsOperation = false;
                        }
                        break;
                    case R.id.b4:
                        if(myState.pointUseIsUsed == false
                                && myState.lastIsPi == false) {
                            myState.pointIsUsed = false;

                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            tmpString = tmpString + 4;
                            resultTV.setText(tmpString);
                            myState.lastIsOperation = false;
                        }
                        break;
                    case R.id.b5:
                        if(myState.pointUseIsUsed == false
                                && myState.lastIsPi == false) {
                            myState.pointIsUsed = false;

                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            tmpString = tmpString + 5;
                            resultTV.setText(tmpString);
                            myState.lastIsOperation = false;
                        }
                        break;
                    case R.id.b6:
                        if(myState.pointUseIsUsed == false
                                && myState.lastIsPi == false) {
                            myState.pointIsUsed = false;

                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            tmpString = tmpString + 6;
                            resultTV.setText(tmpString);
                            myState.lastIsOperation = false;
                        }
                        break;
                    case R.id.b7:
                        if(myState.pointUseIsUsed == false
                                && myState.lastIsPi == false) {
                            myState.pointIsUsed = false;

                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            tmpString = tmpString + 7;
                            resultTV.setText(tmpString);
                            myState.lastIsOperation = false;
                        }
                        break;
                    case R.id.b8:
                        if(myState.pointUseIsUsed == false
                                && myState.lastIsPi == false) {
                            myState.pointIsUsed = false;

                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            tmpString = tmpString + 8;
                            resultTV.setText(tmpString);
                            myState.lastIsOperation = false;
                        }
                        break;
                    case R.id.b9:
                        if(myState.pointUseIsUsed == false
                        && myState.lastIsPi == false) {
                            myState.pointIsUsed = false;

                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            tmpString = tmpString + 9;
                            resultTV.setText(tmpString);
                            myState.lastIsOperation = false;
                        }
                        break;
                    case R.id.bP:
                        if(myState.lastIsPi == false
                                && myState.lastIsOperation == true) {
                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));/////
                            myState.lastIsPi = true;

                            myState.lastIsOperation = false;
                            myState.pointIsUsed = true;
                            myState.pointUseIsUsed = false;
                            tmpString = tmpString + 'p';
                    //        myState.lastString = tmpString;
                    //        myStates.push(new MyState(myState));

                            resultTV.setText(tmpString);
                        }
                        break;
                    case R.id.bDiv:
                        if(!myState.lastIsOperation) {
                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            myState.lastIsPi = false;

                            myState.lastIsOperation = true;
                            myState.pointIsUsed = true;
                            myState.pointUseIsUsed = false;
                            tmpString = tmpString + '/';
                    //        myState.lastString = tmpString;
                    //        myStates.push(new MyState(myState));

                            resultTV.setText(tmpString);
                        }
                        break;
                    case R.id.bMult:
                        if(!myState.lastIsOperation) {
                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            myState.lastIsPi = false;

                            myState.lastIsOperation = true;
                            myState.pointIsUsed = true;
                            myState.pointUseIsUsed = false;
                            tmpString = tmpString + '*';
                    //        myState.lastString = tmpString;
                    //        myStates.push(new MyState(myState));

                            resultTV.setText(tmpString);
                        }
                        break;
                    case R.id.bMin:
                        if(!myState.lastIsOperation) {
                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            myState.lastIsPi = false;

                            myState.lastIsOperation = true;
                            myState.pointIsUsed = true;
                            myState.pointUseIsUsed = false;
                            tmpString = tmpString + '-';
                    //        myState.lastString = tmpString;
                    //        myStates.push(new MyState(myState));

                            resultTV.setText(tmpString);
                        }
                        break;
                    case R.id.bPlus:
                        if(!myState.lastIsOperation) {
                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            myState.lastIsPi = false;

                            myState.lastIsOperation = true;
                            myState.pointIsUsed = true;
                            myState.pointUseIsUsed = false;
                            tmpString = tmpString + '+';
                     //       myState.lastString = tmpString;
                     //       myStates.push(new MyState(myState));

                            resultTV.setText(tmpString);
                        }
                        break;
                    case R.id.bPow:
                        if(!myState.lastIsOperation) {
                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            myState.lastIsPi = false;

                            myState.lastIsOperation = true;
                            myState.pointIsUsed = true;
                            myState.pointUseIsUsed = false;
                            tmpString = tmpString + '^';
                    //       myState.lastString = tmpString;
                    //        myStates.push(new MyState(myState));
                            resultTV.setText(tmpString);
                        }
                        break;
                    case R.id.bPoint:
                        if(myState.pointIsUsed == false
                                && myState.lastIsPi == false) {
                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            myState.pointIsUsed = true;
                            myState.pointUseIsUsed = true;
                            tmpString = tmpString + '.';
                            resultTV.setText(tmpString);
                        }
                        break;
                    case R.id.bEquals:
                        if(!myState.lastIsOperation) {
                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            myState.lastIsOperation = false;
                            myState.pointIsUsed = true;
                            myState.pointUseIsUsed = false;
                            tmpString = resultTV.getText().toString();
                            tmpString = tmpString + " = " + calculator.calculate(tmpString);
                            resultTV.setText(tmpString);
                        }
                        break;
                    case R.id.bBrOp:
                        if(myState.lastIsOperation) {
                            myState.leftBrCount++;
                            myState.lastIsOperation = true;
                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            tmpString = tmpString + '(';
                            resultTV.setText(tmpString);
                        }
                        break;
                    case R.id.bBrCl:
                        if(myState.leftBrCount > myState.rightBrCount
                        && !myState.lastIsOperation) {
                            myState.rightBrCount++;
                            myState.lastIsOperation = false;
                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            tmpString = tmpString + ')';
                            resultTV.setText(tmpString);
                        }
                        break;
                    case R.id.bc:
                        if(myState.lastIsOperation) {
                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            myState.leftBrCount++;
                            tmpString = tmpString + "cos(";
                            resultTV.setText(tmpString);
                        }
                        break;
                    case R.id.bs:
                        if(myState.lastIsOperation) {
                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            myState.leftBrCount++;
                            tmpString = tmpString + "sin(";
                            resultTV.setText(tmpString);
                            break;
                        }
                    case R.id.bt:
                        if(myState.lastIsOperation) {
                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            myState.leftBrCount++;
                            tmpString = tmpString + "tan(";
                            resultTV.setText(tmpString);
                        }
                        break;
                    case R.id.bg:
                        if(myState.lastIsOperation) {
                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            myState.leftBrCount++;
                            tmpString = tmpString + "ctg(";
                            resultTV.setText(tmpString);
                        }
                        break;
                    case R.id.be:
                        if(myState.lastIsOperation) {
                            tmpString = resultTV.getText().toString();
                            myState.lastString = tmpString;
                            myStates.push(new MyState(myState));
                            myState.leftBrCount++;
                            tmpString = tmpString + "exp(";
                            resultTV.setText(tmpString);
                        }
                        break;
                    case R.id.bCE:
                        myState = new MyState();
                        myStates.clear();
                        myState.pointIsUsed = true;
                        myState.pointUseIsUsed = false;
                        tmpString = "";
                        resultTV.setText(tmpString);
                        break;
                    case R.id.bCP:
                        if(myStates.size() > 0) {

                            myState = new MyState(myStates.peek());
                            myStates.pop();

                            tmpString = myState.lastString;
                            resultTV.setText(tmpString);
                        }
                        else
                        {
                            tmpString = "";
                            resultTV.setText(tmpString);
                        }
                        break;

                    default:
                        throw new IllegalStateException("Unexpected value: " + view.getId());
                }
                if(myState.rightBrCount!=myState.leftBrCount) {
                    resultTV.setTextColor(Color.parseColor("#e00202"));
                }
                else{
                    resultTV.setTextColor(Color.parseColor("#111038"));
                }

            }
        };

        myBtn_0.setOnClickListener(onClickListener);
        myBtn_1.setOnClickListener(onClickListener);
        myBtn_2.setOnClickListener(onClickListener);
        myBtn_3.setOnClickListener(onClickListener);
        myBtn_4.setOnClickListener(onClickListener);
        myBtn_5.setOnClickListener(onClickListener);
        myBtn_6.setOnClickListener(onClickListener);
        myBtn_7.setOnClickListener(onClickListener);
        myBtn_8.setOnClickListener(onClickListener);
        myBtn_9.setOnClickListener(onClickListener);
        myBtn_P.setOnClickListener(onClickListener);

        myDiv.setOnClickListener(onClickListener);
        myMult.setOnClickListener(onClickListener);
        myPow.setOnClickListener(onClickListener);
        myPlus.setOnClickListener(onClickListener);
        myMinus.setOnClickListener(onClickListener);

        mySin.setOnClickListener(onClickListener);
        myCos.setOnClickListener(onClickListener);
        myTng.setOnClickListener(onClickListener);
        myCtn.setOnClickListener(onClickListener);
        myExp.setOnClickListener(onClickListener);

        myBrOP.setOnClickListener(onClickListener);
        myBrCL.setOnClickListener(onClickListener);
        myPoint.setOnClickListener(onClickListener);
        myEqual.setOnClickListener(onClickListener);
        myCE.setOnClickListener(onClickListener);
        myC.setOnClickListener(onClickListener);
    }
}