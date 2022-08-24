export const configuration = {
  DEVELOPMENT: {
    IS_SERVER_HTTPS: false,
    IS_SERVER_MOCKED: true,
    LOCALHOST: {
      MOCK_FILES_SERVER: 3013,
      MOCK_SERVER: 3010, // TODO mock server z tego nie korzysta
      WEBPACK_SERVER: 3011,
    },
    
    SERVER: '',
  },
  // SDK_BASE_PATH: '',
  SDK_BASE_PATH: "http://localhost:8443",
}
