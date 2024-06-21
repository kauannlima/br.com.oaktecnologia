package oaktecnologia.service;

import oaktecnologia.model.Produto;
import oaktecnologia.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

        @Autowired
        private ProdutoRepository produtoRepository;

        public List<Produto> listarProdutosOrdenadosPorValor() {
            return produtoRepository.findAllByOrderByValor();
        }

        public Produto cadastrarProduto(Produto produto) {
            return produtoRepository.save(produto);
        }
    }

