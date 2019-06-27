/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Classes.Aluno;
import Classes.Matricula;
import Classes.Turma;
import static formularios.formPrincipal.listaAlunos;
import static formularios.formPrincipal.listaMatriculas;
import static formularios.formPrincipal.listaTurmas;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muriel
 */
public final class formMatricula extends javax.swing.JInternalFrame {
    ArrayList <Integer> listaPosOriginais = new ArrayList();
    Aluno alunoGlobal;
    /**
     * Creates new form CadastroMatricula
     */
    public formMatricula() {
        initComponents();
        preencheCombos();
        controleBtn(true);
        btnVerificar.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbTurmasMatriculadas = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        cbxAlunos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tfSemestre = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnRemoverMatricula = new javax.swing.JButton();
        cbxTurmas = new javax.swing.JComboBox<>();
        btnMatricular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tfCont = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Realizar Matrícula");
        setPreferredSize(new java.awt.Dimension(800, 660));

        tbTurmasMatriculadas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tbTurmasMatriculadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Turma", "Disciplina", "Professor", "Horário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbTurmasMatriculadas);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dkcl.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel1.setText("Matrícular aluno em turmas");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel2.setText("Verificação");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Aluno:");

        cbxAlunos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbxAlunos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione..." }));
        cbxAlunos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxAlunosItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Semestre:");

        tfSemestre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSemestreKeyPressed(evt);
            }
        });

        btnVerificar.setBackground(new java.awt.Color(153, 255, 102));
        btnVerificar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconesBotoes/FormatFactorySearch-32.png"))); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel5.setText("Vinculação");

        btnRemoverMatricula.setBackground(new java.awt.Color(255, 51, 51));
        btnRemoverMatricula.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnRemoverMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconesBotoes/iconesMicro/FormatFactoryDelete-32.png"))); // NOI18N
        btnRemoverMatricula.setText("Remover Selecionado");
        btnRemoverMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverMatriculaActionPerformed(evt);
            }
        });

        cbxTurmas.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        btnMatricular.setBackground(new java.awt.Color(102, 102, 255));
        btnMatricular.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnMatricular.setText("Matricular");
        btnMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Turmas disponíveis para o semestre selecionado:");

        btnImprimir.setBackground(new java.awt.Color(153, 153, 153));
        btnImprimir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconesBotoes/iconesMicro/FormatFactoryPrint-32.png"))); // NOI18N
        btnImprimir.setText("imprimirMatriculas()");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel7.setText("Cont:");

        tfCont.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 8)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("ex: 2017.1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(tfSemestre)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCont, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(247, 247, 247)
                                        .addComponent(btnRemoverMatricula)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbxTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMatricular)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 167, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel8)
                .addGap(1, 1, 1)
                .addComponent(btnVerificar)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMatricular)
                    .addComponent(btnImprimir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoverMatricula)
                    .addComponent(jLabel7)
                    .addComponent(tfCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverMatriculaActionPerformed
        removerAlunoDaTurmaSelecionada();
    }//GEN-LAST:event_btnRemoverMatriculaActionPerformed

    private void btnMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularActionPerformed
        matricularAlunoNaTurmaSelecionada();
    }//GEN-LAST:event_btnMatricularActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        imprimirAllMatriculas();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        verificar();
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void cbxAlunosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxAlunosItemStateChanged
//        if (cbxAlunos.getSelectedIndex() != 0){
//            alunoGlobal = listaAlunos.get(cbxAlunos.getSelectedIndex()-1);
//            atualizarTabela();
//        }
//        else{
//            apagarTabela();
//        }
        verificar();
    }//GEN-LAST:event_cbxAlunosItemStateChanged

    private void tfSemestreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSemestreKeyPressed
        verificar();
    }//GEN-LAST:event_tfSemestreKeyPressed
    public void verificar(){
        cbxTurmas.removeAllItems();
        listaPosOriginais.removeAll(listaPosOriginais);
        int cont = -1;
        for(Turma turmita:listaTurmas){
            cont = cont + 1;
            if(turmita.getSemestre().equals(tfSemestre.getText())){
                cbxTurmas.addItem(turmita.getNumero() + ", " + turmita.getDisciplina().getNome()+ ", " + turmita.getProfessor().getNome()+" ("+turmita.getDisciplina().getCurso().getNome()+")");
                listaPosOriginais.add(cont);
                controleBtn(false);
            }
        }
        if(cbxTurmas.getItemCount() == 0){
          //JOptionPane.showMessageDialog(null,"Nenhuma turma cadastrada nesse semestre");
            apagarTabela();
            controleBtn(true);
        }
        else if(cbxAlunos.getSelectedIndex() == 0 || tfSemestre.equals("")){
            JOptionPane.showMessageDialog(null, "Selecione um aluno!");
            apagarTabela();
            controleBtn(true);
        }
        else{
            alunoGlobal = listaAlunos.get(cbxAlunos.getSelectedIndex()-1);
            atualizarTabela();
            tfCont.setText(contarQtdDeTurmasEmQueOAlunoEstahMatriculado()+"");
            controleBtn(false);
        }
    }
    
    public void matricularAlunoNaTurmaSelecionada(){
        DefaultTableModel modelo = (DefaultTableModel)tbTurmasMatriculadas.getModel();
        String[] linha;
        Turma turmaTemp;
        turmaTemp = listaTurmas.get(listaPosOriginais.get(cbxTurmas.getSelectedIndex()));
        linha = new String[]{turmaTemp.getNumero()+"", turmaTemp.getDisciplina().getNome()+"", turmaTemp.getProfessor().getNome()
        +"",turmaTemp.getHorario()};
        if(evitarDuplicidadeDeMatricula(turmaTemp)){
            if(turmaTemp.verQuantVagasLivres() > 0 && contarQtdDeTurmasEmQueOAlunoEstahMatriculado()<8){
                modelo.addRow(linha);
                listaMatriculas.add(new Matricula(alunoGlobal,turmaTemp));
                turmaTemp.setQtAlunos(turmaTemp.getQtAlunos()+1);
                tfCont.setText(contarQtdDeTurmasEmQueOAlunoEstahMatriculado()+"");
            }
            else if (contarQtdDeTurmasEmQueOAlunoEstahMatriculado()>=8){
                JOptionPane.showMessageDialog(null, "Máximo de turmas matriculadas nesse semestre");
            }
            else{
                JOptionPane.showMessageDialog(null,"Turma lotada!");
            }  
        }
    }
    
    public void removerAlunoDaTurmaSelecionada(){
        DefaultTableModel modelo = (DefaultTableModel)tbTurmasMatriculadas.getModel();
        int numLinha = tbTurmasMatriculadas.getSelectedRow();
        int codTurma = Integer.parseInt(modelo.getValueAt(numLinha, 0).toString());
        for (Matricula matr:listaMatriculas){
            if(matr.getTurma().getNumero() == codTurma){
                matr.getTurma().setQtAlunos(matr.getTurma().getQtAlunos()-1);
                listaMatriculas.remove(matr);
                modelo.removeRow(numLinha);  //Remove a linha da tabela
                tfCont.setText(""+contarQtdDeTurmasEmQueOAlunoEstahMatriculado());
                break; 
            }
        }
    }
    
    public void imprimirAllMatriculas(){
        String saida ="";
        DefaultTableModel modelo = (DefaultTableModel)tbTurmasMatriculadas.getModel();
        saida = saida + alunoGlobal.getNome() + " - " + tfSemestre.getText() + ": \r\n";
        for (int linha=0; linha<modelo.getRowCount();linha++){
            saida = saida + "   " + modelo.getValueAt(linha, 0) + " - "+ modelo.getValueAt(linha, 1) + "\r\n";
        }
        saida = saida + "\nMensalidade: " + mensalidade() +"R$";
        JOptionPane.showMessageDialog(null, saida);
        
        FileWriter arquivo;
		try {
			arquivo = new FileWriter(new File(alunoGlobal.getNome()+"Mensalidade.txt"));
			arquivo.write(saida);
			arquivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void atualizarTabela(){      
        DefaultTableModel modelo = (DefaultTableModel)tbTurmasMatriculadas.getModel();
        String[] linha;
        modelo.setNumRows(0); //Limpa a tabela
        for (Matricula matr : listaMatriculas){
            if (matr.getAluno() == alunoGlobal && (matr.getTurma().getSemestre(). equals(tfSemestre.getText()))){
                linha = new String[]{matr.getTurma().getNumero()+"", matr.getTurma().getDisciplina().getNome(), 
                matr.getTurma().getProfessor().getNome(), matr.getTurma().getHorario()};
                modelo.addRow(linha);
            }
        }
    }
    public void preencheCombos(){
        for(Aluno aluno:listaAlunos){
            cbxAlunos.addItem(aluno.getCgu()+", "+aluno.getNome());
        }
    }
    
    public void controleBtn(boolean n){
        if (n){
            btnMatricular.setEnabled(false);
            btnImprimir.setEnabled(false);
            btnRemoverMatricula.setEnabled(false);
        }
        else{
            btnMatricular.setEnabled(true);
            btnImprimir.setEnabled(true);
            btnRemoverMatricula.setEnabled(true);
        }
    }
    
    public void apagarTabela(){
        DefaultTableModel modelo = (DefaultTableModel)tbTurmasMatriculadas.getModel();
        modelo.setNumRows(0);
    }
    
    public int contarQtdDeTurmasEmQueOAlunoEstahMatriculado(){
        return tbTurmasMatriculadas.getRowCount();
    }
    
    public boolean evitarDuplicidadeDeMatricula(Turma t){
         DefaultTableModel modelo = (DefaultTableModel)tbTurmasMatriculadas.getModel();
          for (int linha=0; linha<modelo.getRowCount();linha++){
              if(modelo.getValueAt(linha, 0).equals(Integer.toString(t.getNumero()))){
                   JOptionPane.showMessageDialog(null, "Já se matriculou nessa turma");
                    return false;
              }
          }
          return true;
    }
    
    public double mensalidade(){
        double valor=0;
        for(Matricula matr:listaMatriculas){
            if (matr.getAluno() == alunoGlobal){
                valor = valor + matr.getTurma().getDisciplina().verValorPagar();
            }
        }
        return valor;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnMatricular;
    private javax.swing.JButton btnRemoverMatricula;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox<String> cbxAlunos;
    private javax.swing.JComboBox<String> cbxTurmas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbTurmasMatriculadas;
    private javax.swing.JTextField tfCont;
    private javax.swing.JTextField tfSemestre;
    // End of variables declaration//GEN-END:variables
}
