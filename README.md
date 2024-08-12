# PlaywrightAutomation
This is an playwright automation from scratch
Run in debug mode
Set the PWDEBUG environment variable to run your Playwright tests in debug mode. This configures Playwright for debugging and opens the inspector. Additional useful defaults are configured when PWDEBUG=1 is set:

Browsers launch in headed mode
Default timeout is set to 0 (= no timeout)
Configure source location
To tell Playwright where to look for the source code that you are debugging, pass a list of the source directories via PLAYWRIGHT_JAVA_SRC environment variable. Paths in the list should be separated by : on macOS and Linux, and by ; on Windows.
