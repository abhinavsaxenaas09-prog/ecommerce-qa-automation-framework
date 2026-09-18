# Framework Architecture

## Layers

1. **Base Layer**  
   Driver lifecycle and common test setup.

2. **Page Layer**  
   Page Object Model classes containing locators and page actions.

3. **Utility Layer**  
   Wait utilities, retry handling, configuration, and reusable helpers.

4. **Listener Layer**  
   Test result hooks for logging, screenshots, and reporting integration.

5. **Test Layer**  
   UI and API test classes grouped as smoke or regression.

6. **CI Layer**  
   GitHub Actions workflow for automated Maven execution.

## Design Principles

- Separation of concerns
- Reusability
- Maintainability
- Readability
- Configurability
- CI/CD readiness
