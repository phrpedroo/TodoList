package com.estudos.pedro.todoList;

import com.estudos.pedro.todoList.entity.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.net.URI;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TodoListApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateTodoSuccess() {
		var todo = new Todo("todo 1", "desc todo 1", false, 1);

		webTestClient
				.post()
				.uri("/todos/salvar")
				.bodyValue(todo)
				.exchange()
				.expectStatus().isOk()
				.expectBody()
				.jsonPath("$").isArray()
			//	.jsonPath("$.length()").isEqualTo(1)
				.jsonPath("$[0]nome").isEqualTo(todo.getNome())
				.jsonPath("$[0]descricao").isEqualTo(todo.getDescricao())
				.jsonPath("$[0]realizado").isEqualTo(todo.isRealizado())
				.jsonPath("$[0]prioridade").isEqualTo(todo.getPrioridade());


	}

	@Test
	void testCreateTodoFailure() {

		webTestClient
				.post()
				.uri("/todos/salvar")
				.bodyValue(
						new Todo("", "", false, 0)
				).exchange()
				.expectStatus().isBadRequest();
	}


}
