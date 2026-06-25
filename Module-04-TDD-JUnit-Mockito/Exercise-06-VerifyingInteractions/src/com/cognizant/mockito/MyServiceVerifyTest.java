package com.cognizant.mockito;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceVerifyTest {

    @Test
    void testVerifyInteraction() {

        ExternalApi mockApi =
                mock(ExternalApi.class);

        MyService service =
                new MyService(mockApi);

        service.fetchData();

        verify(mockApi)
                .getData();
    }
}
