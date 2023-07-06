/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resources;

import javax.swing.JTextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class TextFieldUtils {
    public static void setupClearTextOnFirstClick(JTextField textField, String initialText) {
        textField.setText(initialText);

        textField.addFocusListener(new FocusListener() {
            boolean isFirstClick = true;

            @Override
            public void focusGained(FocusEvent e) {
                if (isFirstClick) {
                    textField.setText("");
                    isFirstClick = false;
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // No se realiza ninguna acción al perder el foco
            }
        });
    }
}

