package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Locacao;

public class LocacaoDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    // LÊ TODOS
    public static List<Locacao> leTodos() throws Exception {

        List<Locacao> lista = new ArrayList<Locacao>();

        try {

            String sql = "SELECT * FROM locacao";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Locacao l = new Locacao();

                l.setIdLocacao(rs.getInt("id_locacao"));
                l.setDataLocacao(rs.getDate("data_locacao"));
                l.setDataPrevistaDevolucao(rs.getDate("data_prevista_devolucao"));
                l.setValorTotal(rs.getDouble("valor_total"));
                l.setStatus(rs.getString("status"));

                l.setVestido(VestidoDAO.leUm(rs.getInt("id_vestido")));
                l.setFuncionario(FuncionarioDAO.leUm(rs.getInt("id_funcionario")));
                l.setCliente(ClienteDAO.leUm(rs.getInt("id_cliente")));
                l.setDevolucao(DevolucaoDAO.leUm(rs.getInt("id_devolucao")));
                l.setPagamento(PagamentoDAO.leUm(rs.getInt("id_pagamento")));

                lista.add(l);

            }

            st.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return lista;

    }

    // LIKE
    public static List<Locacao> leTodosLike(String status) throws Exception {

        List<Locacao> lista = new ArrayList<Locacao>();

        try {

            String sql = "SELECT * FROM locacao WHERE status LIKE ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, "%" + status + "%");

            rs = st.executeQuery();

            while (rs.next()) {

                Locacao l = new Locacao();

                l.setIdLocacao(rs.getInt("id_locacao"));
                l.setDataLocacao(rs.getDate("data_locacao"));
                l.setDataPrevistaDevolucao(rs.getDate("data_prevista_devolucao"));
                l.setValorTotal(rs.getDouble("valor_total"));
                l.setStatus(rs.getString("status"));

                l.setVestido(VestidoDAO.leUm(rs.getInt("id_vestido")));
                l.setFuncionario(FuncionarioDAO.leUm(rs.getInt("id_funcionario")));
                l.setCliente(ClienteDAO.leUm(rs.getInt("id_cliente")));
                l.setDevolucao(DevolucaoDAO.leUm(rs.getInt("id_devolucao")));
                l.setPagamento(PagamentoDAO.leUm(rs.getInt("id_pagamento")));

                lista.add(l);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return lista;

    }

    // NOT IN
    public static List<Locacao> leTodosNotIn(int id1, int id2) throws Exception {

        List<Locacao> lista = new ArrayList<Locacao>();

        try {

            String sql = "SELECT * FROM locacao WHERE id_locacao NOT IN (?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, id1);
            st.setInt(2, id2);

            rs = st.executeQuery();

            while (rs.next()) {

                Locacao l = new Locacao();

                l.setIdLocacao(rs.getInt("id_locacao"));
                l.setDataLocacao(rs.getDate("data_locacao"));
                l.setDataPrevistaDevolucao(rs.getDate("data_prevista_devolucao"));
                l.setValorTotal(rs.getDouble("valor_total"));
                l.setStatus(rs.getString("status"));

                l.setVestido(VestidoDAO.leUm(rs.getInt("id_vestido")));
                l.setFuncionario(FuncionarioDAO.leUm(rs.getInt("id_funcionario")));
                l.setCliente(ClienteDAO.leUm(rs.getInt("id_cliente")));
                l.setDevolucao(DevolucaoDAO.leUm(rs.getInt("id_devolucao")));
                l.setPagamento(PagamentoDAO.leUm(rs.getInt("id_pagamento")));

                lista.add(l);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return lista;

    }

    // BETWEEN
    public static List<Locacao> leTodosBetween(double valorInicial, double valorFinal) throws Exception {

        List<Locacao> lista = new ArrayList<Locacao>();

        try {

            String sql = "SELECT * FROM locacao WHERE valor_total BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setDouble(1, valorInicial);
            st.setDouble(2, valorFinal);

            rs = st.executeQuery();

            while (rs.next()) {

                Locacao l = new Locacao();

                l.setIdLocacao(rs.getInt("id_locacao"));
                l.setDataLocacao(rs.getDate("data_locacao"));
                l.setDataPrevistaDevolucao(rs.getDate("data_prevista_devolucao"));
                l.setValorTotal(rs.getDouble("valor_total"));
                l.setStatus(rs.getString("status"));

                l.setVestido(VestidoDAO.leUm(rs.getInt("id_vestido")));
                l.setFuncionario(FuncionarioDAO.leUm(rs.getInt("id_funcionario")));
                l.setCliente(ClienteDAO.leUm(rs.getInt("id_cliente")));
                l.setDevolucao(DevolucaoDAO.leUm(rs.getInt("id_devolucao")));
                l.setPagamento(PagamentoDAO.leUm(rs.getInt("id_pagamento")));

                lista.add(l);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return lista;

    }

    // LÊ UM
    public static Locacao leUm(int id) throws Exception {

        Locacao l = new Locacao();

        try {

            String sql = "SELECT * FROM locacao WHERE id_locacao = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, id);

            rs = st.executeQuery();

            if (rs.next()) {

                l.setIdLocacao(rs.getInt("id_locacao"));
                l.setDataLocacao(rs.getDate("data_locacao"));
                l.setDataPrevistaDevolucao(rs.getDate("data_prevista_devolucao"));
                l.setValorTotal(rs.getDouble("valor_total"));
                l.setStatus(rs.getString("status"));

                l.setVestido(VestidoDAO.leUm(rs.getInt("id_vestido")));
                l.setFuncionario(FuncionarioDAO.leUm(rs.getInt("id_funcionario")));
                l.setCliente(ClienteDAO.leUm(rs.getInt("id_cliente")));
                l.setDevolucao(DevolucaoDAO.leUm(rs.getInt("id_devolucao")));
                l.setPagamento(PagamentoDAO.leUm(rs.getInt("id_pagamento")));

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return l;

    }

    // GRAVA
    public static int grava(java.sql.Date dataLocacao,
            java.sql.Date dataPrevistaDevolucao,
            double valorTotal,
            String status,
            int idVestido,
            int idFuncionario,
            int idCliente,
            int idDevolucao,
            int idPagamento) throws Exception {

        int ret = 0;

        try {

            String sql = "INSERT INTO locacao "
                    + "(data_locacao, data_prevista_devolucao, valor_total, status, "
                    + "id_vestido, id_funcionario, id_cliente, id_devolucao, id_pagamento) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setDate(1, dataLocacao);
            st.setDate(2, dataPrevistaDevolucao);
            st.setDouble(3, valorTotal);
            st.setString(4, status);
            st.setInt(5, idVestido);
            st.setInt(6, idFuncionario);
            st.setInt(7, idCliente);
            st.setInt(8, idDevolucao);
            st.setInt(9, idPagamento);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    // ALTERA
    public static int altera(java.sql.Date dataLocacao,
            java.sql.Date dataPrevistaDevolucao,
            double valorTotal,
            String status,
            int idVestido,
            int idFuncionario,
            int idCliente,
            int idDevolucao,
            int idPagamento,
            int idLocacao) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE locacao SET data_locacao = ?, "
                    + "data_prevista_devolucao = ?, valor_total = ?, status = ?, "
                    + "id_vestido = ?, id_funcionario = ?, id_cliente = ?, "
                    + "id_devolucao = ?, id_pagamento = ? "
                    + "WHERE id_locacao = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setDate(1, dataLocacao);
            st.setDate(2, dataPrevistaDevolucao);
            st.setDouble(3, valorTotal);
            st.setString(4, status);
            st.setInt(5, idVestido);
            st.setInt(6, idFuncionario);
            st.setInt(7, idCliente);
            st.setInt(8, idDevolucao);
            st.setInt(9, idPagamento);
            st.setInt(10, idLocacao);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    // UPDATE COM LIKE E >
    public static int alteraStatusComLikeEMaior(String novoStatus,
            String statusAtual, double valorTotal) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE locacao SET status = ? "
                    + "WHERE status LIKE ? AND valor_total > ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, novoStatus);
            st.setString(2, "%" + statusAtual + "%");
            st.setDouble(3, valorTotal);

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

            String sql = "DELETE FROM locacao WHERE id_locacao = ?";

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