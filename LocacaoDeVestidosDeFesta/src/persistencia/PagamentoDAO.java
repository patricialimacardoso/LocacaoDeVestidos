package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Pagamento;

public class PagamentoDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    // LÊ TODOS
    public static List<Pagamento> leTodos() throws Exception {
        List<Pagamento> lista = new ArrayList<Pagamento>();

        try {
            String sql = "SELECT * FROM pagamento";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Pagamento p = new Pagamento();

                p.setIdPagamento(rs.getInt("id_pagamento"));
                p.setFormaPagamento(rs.getString("forma_pagamento"));
                p.setValorPago(rs.getDouble("valor_pago"));
                p.setDataPagamento(rs.getDate("data_pagamento"));

                lista.add(p);
            }

            st.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    // LIKE
    public static List<Pagamento> leTodosLike(String formaPagamento) throws Exception {
        List<Pagamento> lista = new ArrayList<Pagamento>();

        try {
            String sql = "SELECT * FROM pagamento WHERE forma_pagamento LIKE ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, "%" + formaPagamento + "%");

            rs = st.executeQuery();

            while (rs.next()) {
                Pagamento p = new Pagamento();

                p.setIdPagamento(rs.getInt("id_pagamento"));
                p.setFormaPagamento(rs.getString("forma_pagamento"));
                p.setValorPago(rs.getDouble("valor_pago"));
                p.setDataPagamento(rs.getDate("data_pagamento"));

                lista.add(p);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    // NOT IN
    public static List<Pagamento> leTodosNotIn(int id1, int id2) throws Exception {
        List<Pagamento> lista = new ArrayList<Pagamento>();

        try {
            String sql = "SELECT * FROM pagamento WHERE id_pagamento NOT IN (?, ?)";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id1);
            st.setInt(2, id2);

            rs = st.executeQuery();

            while (rs.next()) {
                Pagamento p = new Pagamento();

                p.setIdPagamento(rs.getInt("id_pagamento"));
                p.setFormaPagamento(rs.getString("forma_pagamento"));
                p.setValorPago(rs.getDouble("valor_pago"));
                p.setDataPagamento(rs.getDate("data_pagamento"));

                lista.add(p);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    // BETWEEN
    public static List<Pagamento> leTodosBetween(double valorInicial, double valorFinal) throws Exception {
        List<Pagamento> lista = new ArrayList<Pagamento>();

        try {
            String sql = "SELECT * FROM pagamento WHERE valor_pago BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setDouble(1, valorInicial);
            st.setDouble(2, valorFinal);

            rs = st.executeQuery();

            while (rs.next()) {
                Pagamento p = new Pagamento();

                p.setIdPagamento(rs.getInt("id_pagamento"));
                p.setFormaPagamento(rs.getString("forma_pagamento"));
                p.setValorPago(rs.getDouble("valor_pago"));
                p.setDataPagamento(rs.getDate("data_pagamento"));

                lista.add(p);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    // LÊ UM
    public static Pagamento leUm(int id) throws Exception {
        Pagamento p = new Pagamento();

        try {
            String sql = "SELECT * FROM pagamento WHERE id_pagamento = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);

            rs = st.executeQuery();

            if (rs.next()) {
                p.setIdPagamento(rs.getInt("id_pagamento"));
                p.setFormaPagamento(rs.getString("forma_pagamento"));
                p.setValorPago(rs.getDouble("valor_pago"));
                p.setDataPagamento(rs.getDate("data_pagamento"));
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return p;
    }

    // GRAVA
    public static int grava(String formaPagamento, double valorPago, java.sql.Date dataPagamento) throws Exception {
        int ret = 0;

        try {
            String sql = "INSERT INTO pagamento (forma_pagamento, valor_pago, data_pagamento) VALUES (?, ?, ?)";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, formaPagamento);
            st.setDouble(2, valorPago);
            st.setDate(3, dataPagamento);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    // ALTERA
    public static int altera(String formaPagamento, double valorPago, java.sql.Date dataPagamento, int id) throws Exception {
        int ret = 0;

        try {
            String sql = "UPDATE pagamento SET forma_pagamento = ?, valor_pago = ?, data_pagamento = ? WHERE id_pagamento = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, formaPagamento);
            st.setDouble(2, valorPago);
            st.setDate(3, dataPagamento);
            st.setInt(4, id);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    // UPDATE COM LIKE E >
    public static int alteraValorComLikeEMaior(double novoValor, String formaPagamento, int id) throws Exception {
        int ret = 0;

        try {
            String sql = "UPDATE pagamento SET valor_pago = ? WHERE forma_pagamento LIKE ? AND id_pagamento > ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setDouble(1, novoValor);
            st.setString(2, "%" + formaPagamento + "%");
            st.setInt(3, id);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    // EXCLUI
    public static int exclui(int id) throws Exception {
        int ret = 0;

        try {
            String sql = "DELETE FROM pagamento WHERE id_pagamento = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }
}