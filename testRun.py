#!/usr/bin/env python3

import os
import sys

print('Run')
os.system("gradle")


def runUnitTest(path):
    os.environ["ReportPath"] = path
    print('Run unit test')
    os.system("gradle :test --tests 'unit.SimpleCalcTest'")

def runAcceptanceTest(path):
    os.environ["ReportPath"] = path
    print('Run acceptance test')
    os.system("gradle :test --tests 'acceptance.CucumberTest'")


if __name__ == "__main__":
    args = sys.argv
    # args[0] = current file
    # args[1] = function name
    # args[2:] = function args : (*unpacked)
    globals()[args[1]](*args[2:])

