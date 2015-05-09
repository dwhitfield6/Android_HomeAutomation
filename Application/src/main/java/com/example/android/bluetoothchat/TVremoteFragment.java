/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothchat;

import android.app.ActionBar;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Vibrator;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.common.logger.Log;

/**
 * This fragment controls Bluetooth to communicate with other devices.
 */
public class TVremoteFragment extends Fragment {

    private static final String TAG = "TVremoteFragment";

    /**
     * Vibrate motor
     */
    private Vibrator MyVib;

    /**
     *
     * buttons
     */
    private ImageButton bDownArrow;
    private ImageButton bEight;
    private ImageButton bFive;
    private ImageButton bFour;
    private ImageButton bInput;
    private ImageButton bLeftArrow;
    private ImageButton bLouder;
    private ImageButton bMute;
    private ImageButton bNine;
    private ImageButton bOK;
    private ImageButton bOne;
    private ImageButton bQuieter;
    private ImageButton bRightArrow;
    private ImageButton bSeven;
    private ImageButton bSix;
    private ImageButton bThree;
    private ImageButton bTVpower;
    private ImageButton bTwo;
    private ImageButton bUpArrow;
    private ImageButton bZero;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        MyVib = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);
    }

    @Override
    public void onStart() {
        super.onStart();
        setupTVRemote();
    }

    @Override
    public void onDestroy() {
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tv_remote, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        bDownArrow = (ImageButton) view.findViewById(R.id.down_arrow);
        bEight = (ImageButton) view.findViewById(R.id.eight);
        bFive = (ImageButton) view.findViewById(R.id.five);
        bFour = (ImageButton) view.findViewById(R.id.four);
        bLeftArrow = (ImageButton) view.findViewById(R.id.left_arrow);
        bLouder = (ImageButton) view.findViewById(R.id.louder);
        bMute = (ImageButton) view.findViewById(R.id.mute);
        bNine = (ImageButton) view.findViewById(R.id.nine);
        bOK = (ImageButton) view.findViewById(R.id.ok);
        bOne = (ImageButton) view.findViewById(R.id.one);
        bQuieter = (ImageButton) view.findViewById(R.id.quieter);
        bRightArrow = (ImageButton) view.findViewById(R.id.right_arrow);
        bSeven = (ImageButton) view.findViewById(R.id.seven);
        bSix = (ImageButton) view.findViewById(R.id.six);
        bThree = (ImageButton) view.findViewById(R.id.three);
        bTVpower = (ImageButton) view.findViewById(R.id.tvpower);
        bTwo = (ImageButton) view.findViewById(R.id.two);
        bUpArrow = (ImageButton) view.findViewById(R.id.up_arrow);
        bZero = (ImageButton) view.findViewById(R.id.zero);
    }

    /**
     * Set up the UI and background operations for chat.
     */
    private void setupTVRemote() {
        Log.d(TAG, "setupButton()");

        /**
         * Buttons
         */
        // Initialize the send button with a listener that for click events
        bDownArrow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bEight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bInput.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bLeftArrow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bLouder.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bMute.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bNine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bQuieter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bRightArrow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bTVpower.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bUpArrow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });

        bZero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Send a message using content of the edit text widge
                sendMessage("Conf1_ChannelD\r\n");
                if (Global.mState == 3) {
                    MyVib.vibrate(100);
                }
            }
        });
    }

    /**
     * Sends a message.
     *
     * @param message A string of text to send.
     */
    private void sendMessage(String message) {
        // Check that we're actually connected before trying anything
    }

}
