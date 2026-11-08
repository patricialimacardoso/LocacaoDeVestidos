package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Vestido;

public class VestidoDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    // LÊ TODOS
    public static List<Vestido> leTodos() throws Exception {
        List<Vestido> lista = new ArrayList<Vestido>();

        try {
            String sql = "SELECT * FROM vestido";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Vestido v = new Vestido();

                v.setIdVestido(rs.getInt("id_vestido"));
                v.setModelo(rs.getString("modelo"));
                v.setCor(rs.getString("cor"));
                v.setTamanho(rs.getString("tamanho"));
                v.setValorLocacao(rs.getDouble("valor_locacao"));
                v.setStatus(rs.getString("status"));

                lista.add(v);
            }

            st.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    // LIKE
    public static List<Vestido> leTodosLike(String modelo) throws Exception {
        List<Vestido> lista = new ArrayList<Vestido>();

        try {
            String sql = "SELECT * FROM vestido WHERE modelo LIKE ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, "%" + modelo + "%");

            rs = st.executeQuery();

            while (rs.next()) {
                Vestido v = new Vestido();

                v.setIdVestido(rs.getInt("id_vestido"));
                v.setModelo(rs.getString("modelo"));
                v.setCor(rs.getString("cor"));
                v.setTamanho(rs.getString("tamanho"));
                v.setValorLocacao(rs.getDouble("valor_locacao"));
                v.setStatus(rs.getString("status"));

                lista.add(v);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    // NOT IN
    public static List<Vestido> leTodosNotIn(int id1, int id2) throws Exception {
        List<Vestido> lista = new ArrayList<Vestido>();

        try {
            String sql = "SELECT * FROM vestido WHERE id_vestido NOT IN (?, ?)";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id1);
            st.setInt(2, id2);

            rs = st.executeQuery();

            while (rs.next()) {
                Vestido v = new Vestido();

                v.setIdVestido(rs.getInt("id_vestido"));
                v.setModelo(rs.getString("modelo"));
                v.setCor(rs.getString("cor"));
                v.setTamanho(rs.getString("tamanho"));
                v.setValorLocacao(rs.getDouble("valor_locacao"));
                v.setStatus(rs.getString("status"));

                lista.add(v);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    // BETWEEN
    public static List<Vestido> leTodosBetween(double valorInicial, double valorFinal) throws Exception {
        List<Vestido> lista = new ArrayList<Vestido>();

        try {
            String sql = "SELECT * FROM vestido WHERE valor_locacao BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setDouble(1, valorInicial);
            st.setDouble(2, valorFinal);

            rs = st.executeQuery();

            while (rs.next()) {
                Vestido v = new Vestido();

                v.setIdVestido(rs.getInt("id_vestido"));
                v.setModelo(rs.getString("modelo"));
                v.setCor(rs.getString("cor"));
                v.setTamanho(rs.getString("tamanho"));
                v.setValorLocacao(rs.getDouble("valor_locacao"));
                v.setStatus(rs.getString("status"));

                lista.add(v);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    // LÊ UM
    public static Vestido leUm(int id) throws Exception {
        Vestido v = new Vestido();

        try {
            String sql = "SELECT * FROM vestido WHERE id_vestido = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);

            rs = st.executeQuery();

            if (rs.next()) {
                v.setIdVestido(rs.getInt("id_vestido"));
                v.setModelo(rs.getString("modelo"));
                v.setCor(rs.getString("cor"));
                v.setTamanho(rs.getString("tamanho"));
                v.setValorLocacao(rs.getDouble("valor_locacao"));
                v.setStatus(rs.getString("status"));
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return v;
    }

    // GRAVA
    public static int grava(String modelo, String cor, String tamanho, double valorLocacao, String status) throws Exception {
        int ret = 0;

        try {
            String sql = "INSERT INTO vestido (modelo, cor, tamanho, valor_locacao, status) VALUES (?, ?, ?, ?, ?)";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, modelo);
            st.setString(2, cor);
            st.setString(3, tamanho);
            st.setDouble(4, valorLocacao);
            st.setString(5, status);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    // ALTERA
    public static int altera(String modelo, String cor, String tamanho, double valorLocacao, String status, int id) throws Exception {
        int ret = 0;

        try {
            String sql = "UPDATE vestido SET modelo = ?, cor = ?, tamanho = ?, valor_locacao = ?, status = ? WHERE id_vestido = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, modelo);
            st.setString(2, cor);
            st.setString(3, tamanho);
            st.setDouble(4, valorLocacao);
            st.setString(5, status);
            st.setInt(6, id);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    // UPDATE COM LIKE E >
    public static int alteraStatusComLikeEMaior(String novoStatus, String modelo, double valor) throws Exception {
        int ret = 0;

        try {
            String sql = "UPDATE vestido SET status = ? WHERE modelo LIKE ? AND valor_locacao > ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, novoStatus);
            st.setString(2, "%" + modelo + "%");
            st.setDouble(3, valor);

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
            String sql = "DELETE FROM vestido WHERE id_vestido = ?";

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