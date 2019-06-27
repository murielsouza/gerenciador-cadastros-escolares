/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Classes.Disciplina;
import Classes.Matricula;
import Classes.Pratica;
import Classes.Professor;
import Classes.Teorica;
import Classes.Turma;
import javax.swing.JOptionPane;
import static formularios.formPrincipal.listaProfessores;
import static formularios.formPrincipal.listaDisciplinas;
import static formularios.formPrincipal.listaMatriculas;
import static formularios.formPrincipal.listaTurmas;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author lulves
 */
public class formCadTurma extends javax.swing.JInternalFrame {
    Turma turmaGlobal;
    Teorica tt;
    Pratica tc;
    /**
     * Creates new form CadastroTurma
     */
    public formCadTurma() {
        initComponents();
        preencheCombos();
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnImprimirDiario.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupRdBtnTipoTurma = new javax.swing.ButtonGroup();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        rdBtnPratica = new javax.swing.JRadioButton();
        cbxDisciplina = new javax.swing.JComboBox<>();
        rdBtnTeorica = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfSemestre = new javax.swing.JTextField();
        cbxProfessor = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnInserir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnAboutTurma = new javax.swing.JButton();
        btnImprimirDiario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaTurma = new javax.swing.JTextArea();
        tfCodigo = new javax.swing.JTextField();
        tfQtdVagas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        tfHorario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfSala = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Turmas");
        setPreferredSize(new java.awt.Dimension(800, 660));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Disciplina:");

        groupRdBtnTipoTurma.add(rdBtnPratica);
        rdBtnPratica.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rdBtnPratica.setSelected(true);
        rdBtnPratica.setText("Turma Prática");

        cbxDisciplina.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbxDisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione..." }));

        groupRdBtnTipoTurma.add(rdBtnTeorica);
        rdBtnTeorica.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rdBtnTeorica.setText("Turma Teorica");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Semestre:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Professor:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Quantidade de Vagas:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Horario:");

        tfSemestre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        cbxProfessor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbxProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione..." }));

        btnInserir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconesBotoes/iconesMicro/Save-32.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconesBotoes/iconesMicro/FormatFactorySearch-32.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconesBotoes/iconesMicro/FormatFactoryDelete-32.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconesBotoes/iconesMicro/FormatFactoryEdit-32.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnAboutTurma.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnAboutTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconesBotoes/iconesMicro/FormatFactoryFormatFactoryInformation-32.png"))); // NOI18N
        btnAboutTurma.setText("Informações Turma");
        btnAboutTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutTurmaActionPerformed(evt);
            }
        });

        btnImprimirDiario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnImprimirDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconesBotoes/iconesMicro/FormatFactoryPrint-32.png"))); // NOI18N
        btnImprimirDiario.setText("Imprimir Diário");
        btnImprimirDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirDiarioActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saída", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 12))); // NOI18N

        textAreaTurma.setColumns(20);
        textAreaTurma.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        textAreaTurma.setRows(5);
        jScrollPane1.setViewportView(textAreaTurma);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAboutTurma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimirDiario))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnPesquisar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnAboutTurma)
                    .addComponent(btnImprimirDiario))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tfCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        tfQtdVagas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel1.setText("Cadastro Turmas");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel2.setText("Cadastro");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Número da Turma:");

        tfHorario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Tipo Turma");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("Sala/Laborátorio:");

        tfSala.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSalaActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dkcl.jpg"))); // NOI18N
        jLabel11.setText("jLabel7");

        btnCancelar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconesBotoes/iconesMicro/FormatFactoryCancel-32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8)
                                .addComponent(tfCodigo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(8, 8, 8)
                                .addComponent(tfQtdVagas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(cbxProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cbxDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(102, 102, 102))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rdBtnPratica)
                                .addGap(18, 18, 18)
                                .addComponent(rdBtnTeorica)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSala, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 161, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1)
                                .addContainerGap(513, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cbxDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(tfSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(tfQtdVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdBtnPratica)
                    .addComponent(rdBtnTeorica)
                    .addComponent(jLabel10)
                    .addComponent(tfSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        inserir();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void tfSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSalaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnAboutTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutTurmaActionPerformed
        imprimirAll();
    }//GEN-LAST:event_btnAboutTurmaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnImprimirDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirDiarioActionPerformed
        gerarDiario();
    }//GEN-LAST:event_btnImprimirDiarioActionPerformed
    public Turma existeTurma(String num, String semestre){
        for(Turma turma:listaTurmas){
            if (Integer.toString(turma.getNumero()).equals(num) && turma.getSemestre().equals(semestre)){
                return turma;
            }
        }
        return null;
    }
    
    public void inserir(){
        turmaGlobal = existeTurma(tfCodigo.getText(), tfSemestre.getText());
        if (turmaGlobal == null){
            if(validaDados()){ //validaDados()
                if(rdBtnTeorica.isSelected()){
                    turmaGlobal = new Teorica(Integer.parseInt(tfCodigo.getText()), Integer.parseInt(tfQtdVagas.getText()), listaDisciplinas.get(cbxDisciplina.getSelectedIndex()-1),tfSemestre.getText(),listaProfessores.get(cbxProfessor.getSelectedIndex()-1),tfHorario.getText(),Integer.parseInt(tfSala.getText()));
                    listaTurmas.add(turmaGlobal);   
                }
                else{
                    turmaGlobal = new Pratica(Integer.parseInt(tfCodigo.getText()), Integer.parseInt(tfQtdVagas.getText()), listaDisciplinas.get(cbxDisciplina.getSelectedIndex()-1),tfSemestre.getText(),listaProfessores.get(cbxProfessor.getSelectedIndex()-1),tfHorario.getText(),tfSala.getText());
                    listaTurmas.add(turmaGlobal);                   
                }
                JOptionPane.showMessageDialog(null,"A turma de código"+tfCodigo.getText()+" foi cadastrado com sucesso!");
                limpar();
                textAreaTurma.setText(turmaGlobal.toString());
            }
            else{
                textAreaTurma.setText("Verifique os campos e tente novamente");
            }
        }
        else{
            textAreaTurma.setText("Turma já cadastrado no Sistema");
        }
        
    }
    
    public void pesquisar(){
        turmaGlobal = existeTurma(tfCodigo.getText(), tfSemestre.getText());
        if (turmaGlobal !=null){
            JOptionPane.showMessageDialog(null, "Turma localizada!");
            textAreaTurma.setText(turmaGlobal.toString());
            tfCodigo.setText(""+turmaGlobal.getNumero());
            tfSemestre.setText(turmaGlobal.getSemestre());
            cbxDisciplina.setSelectedItem(turmaGlobal.getDisciplina().getNome());
            cbxProfessor.setSelectedItem(turmaGlobal.getProfessor().getNome());
            tfQtdVagas.setText(""+turmaGlobal.getQtVagas());
            tfHorario.setText(turmaGlobal.getHorario());
            if(turmaGlobal instanceof Teorica){
                rdBtnTeorica.setSelected(true);
                tt = (Teorica) turmaGlobal;
                tfSala.setText(""+tt.getNumSala());
            }
            else{
                rdBtnPratica.setSelected(true);
                tc = (Pratica) turmaGlobal;
                tfSala.setText(""+tc.getNomeLab());
            }
            rdBtnPratica.setEnabled(false);
            rdBtnTeorica.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnImprimirDiario.setEnabled(true);
        }
        else{
            textAreaTurma.setText("Turma NÃO localizada!");
        }
        btnInserir.setEnabled(false);
    }
    
    public void alterar(){
        if (validaDados()){ //validaDados()
            turmaGlobal.setNumero(Integer.parseInt(tfCodigo.getText()));
            turmaGlobal.setQtVagas(Integer.parseInt(tfQtdVagas.getText()));
            turmaGlobal.setSemestre(tfSemestre.getText());
            turmaGlobal.setDisciplina(listaDisciplinas.get(cbxDisciplina.getSelectedIndex()-1));
            turmaGlobal.setProfessor(listaProfessores.get(cbxProfessor.getSelectedIndex()-1));
            turmaGlobal.setHorario(tfHorario.getText());
            if (rdBtnTeorica.isSelected()){
                tt = (Teorica) turmaGlobal;
                tt.setNumSala(Integer.parseInt(tfSala.getText()));
            }
            else{
                tc = (Pratica) turmaGlobal;
                tc.setNomeLab(tfSala.getText());
            }
            limpar();
            textAreaTurma.setText("Dados alterados com sucesso!\n"+turmaGlobal.toString());
        }
        else{
            textAreaTurma.setText("Corriga os dados antes de altera-los!");
        }
        btnInserir.setEnabled(true);
    }
    
    public void excluir(){
        int numTurma = turmaGlobal.getNumero();
        for(Matricula matr: listaMatriculas){
            if (matr.getTurma() == turmaGlobal){
                listaMatriculas.remove(matr);
            }
        }
        listaTurmas.remove(turmaGlobal);
        textAreaTurma.setText("A turma de número "+numTurma+" foi removida do sistema!");
        turmaGlobal = null;
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnInserir.setEnabled(true);
        limpar();
        
    }
    
    public void imprimirAll(){
        textAreaTurma.setText("Dados todas as turmas: \n");
        for(Turma t: listaTurmas){
            textAreaTurma.append(t.toString()+"\n");
        }
    }
    
    public void gerarDiario(){
        int cont = 0;
        String textoQueSeraEscrito;
        ArrayList <String> listaAlunosOrdenados = new ArrayList();
        
        textoQueSeraEscrito = turmaGlobal.cabecalhoDoDiario()+ " \r\n \r\n";
        
        for(Matricula matr: listaMatriculas){
            if(matr.getTurma() == turmaGlobal){
                listaAlunosOrdenados.add(matr.getAluno().getNome());
            }
        }
        Collections.sort(listaAlunosOrdenados);
        for(String a: listaAlunosOrdenados){
            textoQueSeraEscrito = textoQueSeraEscrito +(cont = cont+1)+"º - "+a + " \r\n";
        }
        limpar();
        textAreaTurma.setText(textoQueSeraEscrito + "\nDiário de turma gerado com sucesso!");
        JOptionPane.showMessageDialog(null, "Arquivo .txt gerado com sucesso!");
        
		FileWriter arquivo;
		try {
			arquivo = new FileWriter(new File("turma"+turmaGlobal.getNumero()+"Diario.txt"));
			arquivo.write(textoQueSeraEscrito);
			arquivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
    }
    
    public void limpar(){
        tfCodigo.setText("");
        tfQtdVagas.setText("");
        tfSemestre.setText("");
        tfHorario.setText("");
        cbxDisciplina.setSelectedIndex(0);
        cbxProfessor.setSelectedIndex(0);
        tfSala.setText("");
        rdBtnTeorica.isSelected();
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnInserir.setEnabled(true);
        btnImprimirDiario.setEnabled(false);
        rdBtnPratica.setEnabled(true);
        rdBtnTeorica.setEnabled(true);
    }
     

    
    
    public void preencheCombos(){
        for (Disciplina d: listaDisciplinas){
            cbxDisciplina.addItem(d.getNome());
        }
        for (Professor p: listaProfessores){
            cbxProfessor.addItem(p.getNome());
        }
    }
    
    public boolean validaDados(){
        if(rdBtnTeorica.isSelected() && !(tfSala.getText().matches("[0-9]*"))){
            JOptionPane.showMessageDialog(null, "Turma teorica tem apenas números no campo sala");
            return false;
        }
        if(!(tfCodigo.getText().equals("")) && !(tfSemestre.getText().equals("")) && cbxDisciplina.getSelectedIndex()!=0 && cbxProfessor.getSelectedIndex()!=0 && !(tfQtdVagas.getText().equals("")) && !(tfHorario.getText().equals("")) && !(tfSala.getText().equals(""))){
          if ((tfCodigo.getText()).matches("[0-9]*")){
              Turma validar = existeTurma(tfCodigo.getText(), tfSemestre.getText());
              if (validar == turmaGlobal){
                  return true;
              }
              else if (validar != turmaGlobal && validar !=null){
                  JOptionPane.showMessageDialog(null,"Uma turma com esse número já esta cadastrada!");
                  return false;
              }
              else{
                  return true;
              }
            }
        } 
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutTurma;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnImprimirDiario;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbxDisciplina;
    private javax.swing.JComboBox<String> cbxProfessor;
    private javax.swing.ButtonGroup groupRdBtnTipoTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JRadioButton rdBtnPratica;
    private javax.swing.JRadioButton rdBtnTeorica;
    private javax.swing.JTextArea textAreaTurma;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfHorario;
    private javax.swing.JTextField tfQtdVagas;
    private javax.swing.JTextField tfSala;
    private javax.swing.JTextField tfSemestre;
    // End of variables declaration//GEN-END:variables
}