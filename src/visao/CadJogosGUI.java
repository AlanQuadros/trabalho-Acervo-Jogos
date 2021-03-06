/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import dao.GeneroDAO;
import dao.JogoDAO;
import dao.PlataformaDAO;
import dao.ProdutoraDAO;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Genero;
import modelo.Jogo;
import modelo.Plataforma;
import modelo.Produtora;

/**
 *
 * @author 15202607
 */
public class CadJogosGUI extends javax.swing.JInternalFrame {

     /**
      * Creates new form CadJogosGUI
      */
     public CadJogosGUI() {
          initComponents();
          preencheComboProdutoras();
          preencherComboGenero();
          preencherComboPlataforma();
     }

     /**
      * This method is called from within the constructor to initialize the
      * form. WARNING: Do NOT modify this code. The content of this method is
      * always regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          jcomboProdutora = new javax.swing.JComboBox();
          jcomboPlataforma = new javax.swing.JComboBox();
          jcomboGenero = new javax.swing.JComboBox();
          jbCadastrar = new javax.swing.JButton();
          jbLimpar = new javax.swing.JButton();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          jtCodJogo = new javax.swing.JTextField();
          jLabel5 = new javax.swing.JLabel();
          jtNome = new javax.swing.JTextField();
          jLabel6 = new javax.swing.JLabel();
          jtMetacritica = new javax.swing.JTextField();
          jLabel7 = new javax.swing.JLabel();
          jtEsrb = new javax.swing.JTextField();
          jLabel8 = new javax.swing.JLabel();
          jScrollPane1 = new javax.swing.JScrollPane();
          jtextDescricao = new javax.swing.JTextArea();
          jLabel9 = new javax.swing.JLabel();
          jtMaxPlayers = new javax.swing.JTextField();
          jLabel10 = new javax.swing.JLabel();
          jtPersonagem = new javax.swing.JTextField();
          jLabel11 = new javax.swing.JLabel();
          jtDataLanc = new javax.swing.JTextField();

          setClosable(true);
          setTitle("Cadastro de Jogos");

          jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

          jbCadastrar.setText("Cadastrar");
          jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jbCadastrarActionPerformed(evt);
               }
          });

          jbLimpar.setText("Limpar");
          jbLimpar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jbLimparActionPerformed(evt);
               }
          });

          jLabel1.setText("Produtora");

          jLabel2.setText("Gênero");

          jLabel3.setText("Plataforma");

          jLabel4.setText("Código");

          jLabel5.setText("Nome");

          jLabel6.setText("Metacrítica");

          jLabel7.setText("ESRB");

          jLabel8.setText("Descrição");

          jtextDescricao.setColumns(20);
          jtextDescricao.setRows(5);
          jScrollPane1.setViewportView(jtextDescricao);

          jLabel9.setText("Máximo de Players");

          jLabel10.setText("Personagem");

          jLabel11.setText("Data de Lançamento");

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addComponent(jLabel4)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jtCodJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jLabel5)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jtNome))
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addComponent(jLabel8)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jScrollPane1))
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                             .addComponent(jLabel9)
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                             .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                             .addComponent(jLabel10)
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                             .addComponent(jLabel2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                  .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jtPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                                  .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                                   .addComponent(jtMaxPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtMetacritica, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addGap(4, 4, 4)
                                        .addComponent(jtEsrb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(jcomboProdutora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(jcomboGenero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(jcomboPlataforma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(jtDataLanc, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                    .addContainerGap())
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel4)
                         .addComponent(jtCodJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel5)
                         .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel6)
                         .addComponent(jtMetacritica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel7)
                         .addComponent(jtEsrb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabel8)
                         .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addComponent(jLabel9)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jtMaxPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(jLabel10))
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addGap(5, 5, 5)
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(jcomboProdutora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jLabel1))
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(jcomboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jLabel2))))
                    .addGap(4, 4, 4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jcomboPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel3)
                         .addComponent(jtPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel11)
                         .addComponent(jtDataLanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jbCadastrar)
                         .addComponent(jbLimpar))
                    .addContainerGap())
          );

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     public void limpar(){
          jtCodJogo.setText(null);
          jtDataLanc.setText(null);
          jtEsrb.setText(null);
          jtMaxPlayers.setText(null);
          jtMetacritica.setText(null);
          jtNome.setText(null);
          jtPersonagem.setText(null);
          jtextDescricao.setText(null);
          jcomboGenero.setSelectedIndex(0);
          jcomboPlataforma.setSelectedIndex(0);
          jcomboProdutora.setSelectedIndex(0);
     }
     
     private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
          try {
               Jogo j = new Jogo();

               j.setIdJogo(Long.parseLong(jtCodJogo.getText()));
               j.setNomeJogo(jtNome.getText());
               j.setMetacritica(Integer.parseInt(jtMetacritica.getText()));
               j.setEsrb(jtEsrb.getText());
               j.setDescricao(jtextDescricao.getText());
               j.setMaxPlayers(Integer.parseInt(jtMaxPlayers.getText()));
               j.setPersonagem(jtPersonagem.getText());
               j.setDataLancamento(Date.valueOf(jtDataLanc.getText()));

               int opG = jcomboGenero.getSelectedIndex();
               int opPla = jcomboPlataforma.getSelectedIndex();
               int opPro = jcomboProdutora.getSelectedIndex();
               
               if (opG == 0) {
                    throw new Exception("Escolha um gênero!");
               } else {
                    j.setGenero((Genero) jcomboGenero.getSelectedItem());
               }
               
               if (opPla == 0) {
                    throw new Exception("Escolha uma plataforma!");
               } else {
                    j.setPlataforma((Plataforma) jcomboPlataforma.getSelectedItem());
               }
               
               if (opPro == 0) {
                    throw new Exception("Escolha uma produtora!");
               } else {
                    j.setProdutora((Produtora) jcomboProdutora.getSelectedItem());
               }
               
               JogoDAO jDAO = new JogoDAO();
               
               jDAO.insertJogo(j);
               JOptionPane.showMessageDialog(null, "Jogo cadastrada com sucesso!");
               limpar();
          } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Erro ao cadastrar jogo!\n"+e.getMessage());
          }
     }//GEN-LAST:event_jbCadastrarActionPerformed

     private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
          limpar();
     }//GEN-LAST:event_jbLimparActionPerformed

     private void preencheComboProdutoras() {
          try {
               List<Produtora> produtoras = new ArrayList<>();
               ProdutoraDAO pDAO = new ProdutoraDAO();
               produtoras = pDAO.getListaPlataforma();

               jcomboProdutora.addItem("--Selecione--");
               for (int i = 0; i < produtoras.size(); i++) {
                    jcomboProdutora.addItem(produtoras.get(i));
               }

          } catch (Exception e) {
               JOptionPane.showMessageDialog(this,
                       "Erro\n" + e.getMessage(),
                       "ERRO",
                       JOptionPane.ERROR_MESSAGE);
          }
     }

     private void preencherComboGenero() {
          try {
               List<Genero> generos = new ArrayList<>();
               GeneroDAO gDAO = new GeneroDAO();
               generos = gDAO.getListaGenero();

               jcomboGenero.addItem("--Selecione--");
               for (int i = 0; i < generos.size(); i++) {
                    jcomboGenero.addItem(generos.get(i));
               }

          } catch (Exception e) {
               JOptionPane.showMessageDialog(this,
                       "Erro\n" + e.getMessage(),
                       "ERRO",
                       JOptionPane.ERROR_MESSAGE);
          }
     }

     private void preencherComboPlataforma() {
          try {
               List<Plataforma> plataformas = new ArrayList<>();
               PlataformaDAO pDAO = new PlataformaDAO();
               plataformas = pDAO.getListaPlataforma();

               jcomboPlataforma.addItem("--Selecione--");
               for (int i = 0; i < plataformas.size(); i++) {
                    jcomboPlataforma.addItem(plataformas.get(i));
               }

          } catch (Exception e) {
               JOptionPane.showMessageDialog(this,
                       "Erro\n" + e.getMessage(),
                       "ERRO",
                       JOptionPane.ERROR_MESSAGE);
          }

     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
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
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JButton jbCadastrar;
     private javax.swing.JButton jbLimpar;
     private javax.swing.JComboBox jcomboGenero;
     private javax.swing.JComboBox jcomboPlataforma;
     private javax.swing.JComboBox jcomboProdutora;
     private javax.swing.JTextField jtCodJogo;
     private javax.swing.JTextField jtDataLanc;
     private javax.swing.JTextField jtEsrb;
     private javax.swing.JTextField jtMaxPlayers;
     private javax.swing.JTextField jtMetacritica;
     private javax.swing.JTextField jtNome;
     private javax.swing.JTextField jtPersonagem;
     private javax.swing.JTextArea jtextDescricao;
     // End of variables declaration//GEN-END:variables
}
