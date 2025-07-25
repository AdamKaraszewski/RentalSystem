package com.rental_manager.roomie.utils.account_module_utils;

import org.junit.jupiter.api.Test;

import static com.rental_manager.roomie.AccountModuleTestUtility.*;
import static org.junit.jupiter.api.Assertions.*;

class AccountConverterTest {

    @Test
    void convertRegisterClientDTOToAccountTest() {
        var actual = AccountConverter.convertRegisterClientDTOToAccount(TEST_REGISTER_CLIENT_DTO_NO_1);
        assertNull(actual.getId());
        assertEquals(TEST_REGISTER_CLIENT_DTO_NO_1.getFirstName(), actual.getFirstName());
        assertEquals(TEST_REGISTER_CLIENT_DTO_NO_1.getLastName(), actual.getLastName());
        assertEquals(TEST_REGISTER_CLIENT_DTO_NO_1.getUsername(), actual.getUsername());
        assertEquals(TEST_REGISTER_CLIENT_DTO_NO_1.getEmail(), actual.getEmail());
        assertTrue(actual.isActive());
        assertFalse(actual.isVerified());
        assertEquals(TEST_REGISTER_CLIENT_DTO_NO_1.getPassword(), actual.getPassword());
    }

    @Test
    void convertAccountToAccountOnPageDTO() {
        var actual = AccountConverter.convertAccountToAccountOnPageDto(createNotVerifiedAccount());
        assertNotNull(actual);
        assertEquals(USERNAME, actual.getUsername());
        assertEquals(FIRST_NAME, actual.getFirstName());
        assertEquals(LAST_NAME, actual.getLastName());
    }
}
