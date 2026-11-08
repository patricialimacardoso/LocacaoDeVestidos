package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Devolucao;

public class DevolucaoDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    // LÊ TODOS
    public static List<Devolucao> leTodos() throws Exception {

        List<Devolucao> lista = new ArrayList<Devolucao>();

        try {

            String sql = "SELECT * FROM devolucao";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Devolucao d = new Devolucao();

                d.setIdDevolucao(rs.getInt("id_devolucao"));
                d.setDataDevolucao(rs.getDate("data_devolucao"));
                d.setMulta(rs.getDouble("multa"));
                d.setObservacao(rs.getString("observacao"));

                lista.add(d);

            }

            st.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return lista;

    }

    // LIKE
    public static List<Devolucao> leTodosLike(String observacao) throws Exception {

        List<Devolucao> lista = new ArrayList<Devolucao>();

        try {

            String sql = "SELECT * FROM devolucao WHERE observacao LIKE ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, "%" + observacao + "%");

            rs = st.executeQuery();

            while (rs.next()) {

                Devolucao d = new Devolucao();

                d.setIdDevolucao(rs.getInt("id_devolucao"));
                d.setDataDevolucao(rs.getDate("data_devolucao"));
                d.setMulta(rs.getDouble("multa"));
                d.setObservacao(rs.getString("observacao"));

                lista.add(d);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return lista;

    }

    // NOT IN
    public static List<Devolucao> leTodosNotIn(int id1, int id2) throws Exception {

        List<Devolucao> lista = new ArrayList<Devolucao>();

        try {

            String sql = "SELECT * FROM devolucao WHERE id_devolucao NOT IN (?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, id1);
            st.setInt(2, id2);

            rs = st.executeQuery();

            while (rs.next()) {

                Devolucao d = new Devolucao();

                d.setIdDevolucao(rs.getInt("id_devolucao"));
                d.setDataDevolucao(rs.getDate("data_devolucao"));
                d.setMulta(rs.getDouble("multa"));
                d.setObservacao(rs.getString("observacao"));

                lista.add(d);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return lista;

    }

    // BETWEEN
    public static List<Devolucao> leTodosBetween(double multaInicial, double multaFinal) throws Exception {

        List<Devolucao> lista = new ArrayList<Devolucao>();

        try {

            String sql = "SELECT * FROM devolucao WHERE multa BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setDouble(1, multaInicial);
            st.setDouble(2, multaFinal);

            rs = st.executeQuery();

            while (rs.next()) {

                Devolucao d = new Devolucao();

                d.setIdDevolucao(rs.getInt("id_devolucao"));
                d.setDataDevolucao(rs.getDate("data_devolucao"));
                d.setMulta(rs.getDouble("multa"));
                d.setObservacao(rs.getString("observacao"));

                lista.add(d);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return lista;

    }

    // LÊ UM
    public static Devolucao leUm(int id) throws Exception {

        Devolucao devolucao = new Devolucao();

        try {

            String sql = "SELECT * FROM devolucao WHERE id_devolucao = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, id);

            rs = st.executeQuery();

            if (rs.next()) {

                devolucao.setIdDevolucao(rs.getInt("id_devolucao"));
                devolucao.setDataDevolucao(rs.getDate("data_devolucao"));
                devolucao.setMulta(rs.getDouble("multa"));
                devolucao.setObservacao(rs.getString("observacao"));

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return devolucao;

    }

    // GRAVA
    public static int grava(java.sql.Date dataDevolucao,
            double multa, String observacao) throws Exception {

        int ret = 0;

        try {

            String sql = "INSERT INTO devolucao (data_devolucao,multa,observacao) VALUES (?, ?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setDate(1, dataDevolucao);
            st.setDouble(2, multa);
            st.setString(3, observacao);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    // ALTERA
    public static int altera(java.sql.Date dataDevolucao,
            double multa, String observacao, int id) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE devolucao SET data_devolucao = ?, multa = ?, observacao = ? WHERE id_devolucao = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setDate(1, dataDevolucao);
            st.setDouble(2, multa);
            st.setString(3, observacao);
            st.setInt(4, id);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    // UPDATE COM LIKE E >
    public static int alteraMultaComLikeEMaior(double novaMulta,
            String observacao, int id) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE devolucao SET multa = ? WHERE observacao LIKE ? AND id_devolucao > ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setDouble(1, novaMulta);
            st.setString(2, "%" + observacao + "%");
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

            String sql = "DELETE FROM devolucao WHERE id_devolucao = ?";

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