package opciones.operacionesmatematicas;
import static clases.constantes.MatematicasString.*;

import static clases.constantes.MatematicasEnteros.*;
import clases.operaciones.MatematicasLogica;
import menu.Menu;

import javax.swing.*;
import java.awt.*;



public class OperacionesMatematicas extends Frame {
    MatematicasLogica matematicasLogica = new MatematicasLogica();


    protected JPanel operacionesmatematicasform;
    protected JTextField txtnumero1;
    protected JTextField txtnumero2;
    protected JButton btnmultiplicar;
    protected JButton btndividir;
    protected JButton btnrestar;
    protected JButton btnsalir;
    protected JLabel lblresultado;
    protected JButton btnsumar;

    public OperacionesMatematicas() {
        add(operacionesmatematicasform);
        setTitle(TITULO_OPCION.getTexto());
        setSize(QUINIENTOS.getValor(),SEISCIENTOS.getValor());

          btnsalir.addActionListener(e ->{
                Menu menu= new Menu();
                menu.setVisible(true);
                esconderventana();
        });
        btnsumar.addActionListener(e-> {

            datos(txtnumero1.getText(), txtnumero2.getText());
            lblresultado.setText(String.valueOf(matematicasLogica.calcularsuma()));

        } );
        btnrestar.addActionListener(e-> {


                datos(txtnumero1.getText(), txtnumero2.getText());
                lblresultado.setText(String.valueOf(matematicasLogica.calcularresta()));

        } );


        btnmultiplicar.addActionListener(e-> {


                datos(txtnumero1.getText(), txtnumero2.getText());
                lblresultado.setText(String.valueOf(matematicasLogica.calcularmultiplicacion()));

        });
        btndividir.addActionListener(e-> {

                    datos(txtnumero1.getText(), txtnumero2.getText());
            lblresultado.setText(String.valueOf(matematicasLogica.calculardivision()));
                }
        );



    }



    private void esconderventana() {
        this.dispose();
    }
    private void datos(String valor1, String valor2) {

        matematicasLogica.setNumero1(Double.parseDouble(valor1));
        matematicasLogica.setNumero2(Double.parseDouble(valor2));
        lblresultado.setVisible(true);


    }
}
